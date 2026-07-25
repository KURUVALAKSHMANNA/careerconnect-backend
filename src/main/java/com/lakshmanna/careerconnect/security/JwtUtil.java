package com.lakshmanna.careerconnect.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.security.Keys;
import java.security.Key;


@Component
public class JwtUtil {
	
	// Secrete Key (minimu 32 characters)
	private static final String SECRETE_KEY = "mysecretekeymysecretekeymysecretekey12";
//	Generate signing key
	private Key getSignKey() {
		return Keys.hmacShaKeyFor(SECRETE_KEY.getBytes());
	}
	
	public String generateToken(String email) {
		return Jwts.builder()
				.subject(email)
				.issuedAt(new Date()) 
				.expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
				.signWith(getSignKey(), SignatureAlgorithm.HS256)
				.compact();
	}
}
