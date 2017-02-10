package com.xamarinpocbanque.server.dto;

import javax.persistence.Column;

public class UserDTO {
	
	private Long id;
    private String lastName;
    private Long firstName;
    private Long login;
    private Long password;
    private String email ;
    private int phone;
    private int bankId;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getFirstName() {
		return firstName;
	}
	public void setFirstName(Long firstName) {
		this.firstName = firstName;
	}
	public Long getLogin() {
		return login;
	}
	public void setLogin(Long login) {
		this.login = login;
	}
	public Long getPassword() {
		return password;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
    

}
