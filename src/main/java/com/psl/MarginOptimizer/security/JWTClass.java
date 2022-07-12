package com.psl.MarginOptimizer.security;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTClass {

	
	private static final long serialVersionUID = -2550185165626007488L;

	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	@Value ("${jwt.secret}")
	private String secret; 
	
	public String generateToken(String emailid) {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(claims, emailid);
	}

	private String doGenerateToken(Map<String, Object> claims, String subject) {

//		System.out.println(secret);
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}
}
