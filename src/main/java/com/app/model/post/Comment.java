package com.app.model.post;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.app.model.AbstractModel;
import com.app.model.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment extends AbstractModel {
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	private User commentator;
	@ManyToMany
	@JoinTable(name = "comment_voter", joinColumns = @JoinColumn(name = "comment_id"),
	inverseJoinColumns = @JoinColumn(name = "voter_id"))
	private Set<User> voters;
	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "replyment_id")
	private Set<Comment> replyments;
	@ManyToOne(fetch = FetchType.LAZY)
	private Post post;
	
	//fr map
}
