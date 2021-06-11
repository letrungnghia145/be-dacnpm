package com.app.model.tag;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.app.model.AbstractModel;
import com.app.model.post.Post;
import com.app.model.user.User;

import lombok.Setter;

import lombok.Getter;

@Entity
@Getter
@Setter
public class Tag extends AbstractModel {
	private String name;
	private String description;
	@ManyToMany
	@JoinTable(name = "tag_member", joinColumns = @JoinColumn(name = "tag_id"),
	inverseJoinColumns = @JoinColumn(name = "member_id"))
	private Set<User> interestingMembers;
	
	//fr map
	@ManyToMany(mappedBy = "tags")
	private Set<Post> posts;
}
