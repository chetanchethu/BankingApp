package com.cap.banking.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.cap.banking.model.Address;

public class CustomerInfo {
	private long id;
    
	@NotNull(message="Account Number cannot be null")
	private long accountNumber;
    
	@NotBlank(message="Account type cannot be blank")
	private String accountType;

	@NotBlank(message="Name cannot be left blank")
	private String name;
	
	@Min(18)
	@Max(70)
	private int age;
	
	@Email(message = "email is not valid")
	private String email;
	
	@NotNull
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile number")
	private String mobile;
	
	@NotNull(message = "Nationality cannot be null")
	private String nationality;
    
	@NotNull(message="Address cannot be left blank")
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
