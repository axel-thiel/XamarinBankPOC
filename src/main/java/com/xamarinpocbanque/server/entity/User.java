package com.xamarinpocbanque.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	@Id
    @SequenceGenerator(name = "xambanque_uid", sequenceName = "xambanque_uid", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xambanque_uid")
    @Column(name="id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    
    @Column(name = "login")
    private Long login;
    
    @Column(name = "password")
    private Long password;
    
    @Column(name = "email")
    private String email ;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name= "bank_id")
    private Long bankId;
    
    

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
            
    
}
