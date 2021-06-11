package com.app.model.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.app.model.AbstractModel;
import com.app.model.address.Address;
import com.app.model.post.Comment;
import com.app.model.post.Post;
import com.app.model.tag.Tag;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractModel {
	private String fullname;
	private String username;
	private String password;
	private String email;
	private String phone;
	private boolean isActive;

	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
	private Set<Address> address;

	// fr map
	@OneToMany(mappedBy = "author") // one user may create many posts
	private Set<Post> posts;
	@OneToMany(mappedBy = "commentator") // one user may comment in many posts
	private Set<Comment> comments;
	@ManyToMany(mappedBy = "interestingMembers") // user could follow many tags
	private Set<Tag> interestedTags;
	@ManyToMany(mappedBy = "voters") // one user can be like other user's comments
	private Set<Comment> votedComments;
	@ManyToMany(mappedBy = "voters") // one user can be like many posts
	private Set<Post> votedPosts;
	@ManyToMany(mappedBy = "sharers") // one user can be share many posts
	private Set<Post> sharedPosts;

//	public void addAddress(Address address) {
//		this.address = address;
//		address.setUser(this);
//	}

	public User(String fullname, String username, String password, String email, String phone) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

}
