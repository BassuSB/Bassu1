package com.jsp.idfcmock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class MockDto {
	@Id
private int id;
private String name;
private String email;
private String rating;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}


}
