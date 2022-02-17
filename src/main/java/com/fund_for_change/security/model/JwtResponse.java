package com.fund_for_change.security.model;

public class JwtResponse {
	private String tokenPurpose;
	private String tokenString;

	public JwtResponse(String tokenPurpose, String tokenString) {
		this.tokenPurpose = tokenPurpose;
		this.tokenString = tokenString;
	}

	public JwtResponse() {
	}

	public String getTokenPurpose() {
		return tokenPurpose;
	}

	public void setTokenPurpose(String tokenPurpose) {
		this.tokenPurpose = tokenPurpose;
	}

	public String getTokenString() {
		return tokenString;
	}

	public void setTokenString(String tokenString) {
		this.tokenString = tokenString;
	}

	@Override
	public String toString() {
		return "JwtResponse [tokenPurpose=" + tokenPurpose + ", tokenString=" + tokenString + "]";
	}

}
