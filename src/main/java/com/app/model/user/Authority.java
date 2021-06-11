package com.app.model.user;

public enum Authority {
	MEMBER_POST("member:post");

	private String authority;

	private Authority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}
}
