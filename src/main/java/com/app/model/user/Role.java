package com.app.model.user;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum Role {
	MEMBER(new HashSet<>(Arrays.asList(
		Authority.MEMBER_POST
	))),
	ADMIN(new HashSet<>(Arrays.asList(
			
	)));

	private Set<Authority> authorities;

	private Role(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}
}
