package com.app.model.post;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.app.model.AbstractModel;
import com.app.model.tag.Tag;
import com.app.model.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends AbstractModel {
	private String title;
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	private User author;
	@Column(name = "count_view")
	private Integer counter;
	@Column(name = "value")
	private Integer evaluateValue;
	@ManyToMany
	@JoinTable(name = "post_tag", joinColumns = @JoinColumn(name = "post_id"),
	inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private Set<Tag> tags;
	@ManyToMany
	@JoinTable(name = "post_voter", joinColumns = @JoinColumn(name = "post_id"),
	inverseJoinColumns = @JoinColumn(name = "voter_id"))
	private Set<User> voters;
	@ManyToMany
	@JoinTable(name = "post_sharer", joinColumns = @JoinColumn(name = "post_id"),
	inverseJoinColumns = @JoinColumn(name = "sharer_id"))
	private Set<User> sharers;
	
	//fr map
	@OneToMany(orphanRemoval = true, mappedBy = "post")
	private Set<Comment> comments;
	@OneToMany(mappedBy = "post", orphanRemoval = true)
	private Set<Media> media;
}
