package com.fund_for_change.dto;


public class UserDTO {
	private String userName;
	private String fullName;
	private String userEmail;
	private Long userPhone;
	private String password;
	private String confirmPassword;
	
	private String division;
	private String zilla;
	private String upZilla;
	private String area;
		
	private String role;

	public UserDTO() {

	}

	public UserDTO(String userName, String fullName, String userEmail, Long userPhone, String password,
			String confirmPassword, String division, String zilla, String upZilla, String area, String role) {
		
		this.userName = userName;
		this.fullName = fullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.division = division;
		this.zilla = zilla;
		this.upZilla = upZilla;
		this.area = area;
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getZilla() {
		return zilla;
	}

	public void setZilla(String zilla) {
		this.zilla = zilla;
	}

	public String getUpZilla() {
		return upZilla;
	}

	public void setUpZilla(String upZilla) {
		this.upZilla = upZilla;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", fullName=" + fullName + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", password=" + password + ", confirmPassword=" + confirmPassword + ", division="
				+ division + ", zilla=" + zilla + ", upZilla=" + upZilla + ", area=" + area + ", role=" + role + "]";
	}

	

	
}
