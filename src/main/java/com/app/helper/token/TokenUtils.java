package com.app.helper.token;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenUtils {
	public static String generateJwtToken(String username) {
		return Jwts.builder()
				.addClaims(new HashMap<>())
				.setIssuer("").setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()))
				.setSubject(username)
				.signWith(SignatureAlgorithm.HS512, Base64.getEncoder().encode("secretkey".getBytes()))
				.compact();
	}
	public static void main(String[] args) {
		String generateJwtToken = TokenUtils.generateJwtToken("nghia1k45@gmail.com");
		System.out.println(generateJwtToken);
	}
}
 