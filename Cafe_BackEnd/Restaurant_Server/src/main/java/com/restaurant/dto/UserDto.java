package com.restaurant.dto;

import com.restaurant.enums.UserRole;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

//@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;

    private MultipartFile img;

    private byte[] returnedImg;

	public UserDto(Long id, String email, String name, UserRole userRole, MultipartFile img, byte[] returnedImg) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.userRole = userRole;
		this.img = img;
		this.returnedImg = returnedImg;
	}

	public UserDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}

	public byte[] getReturnedImg() {
		return returnedImg;
	}

	public void setReturnedImg(byte[] returnedImg) {
		this.returnedImg = returnedImg;
	}
    
    
}
