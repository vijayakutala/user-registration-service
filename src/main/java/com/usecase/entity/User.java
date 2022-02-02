package com.usecase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User{
	@Id
	@Column(name="LOGIN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="USER_NAME")
	private String username;
	@Column(name="DOCUMENT_NAME")
	private String documentName;
	@Column(name="DOCUMENT_ID")
	private String documentId;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_NBR")
	private long phoneNbr;
	@Column(name="PAN_NBR")
	private String panNbr;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNbr() {
		return phoneNbr;
	}
	public void setPhoneNbr(long phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	public String getPanNbr() {
		return panNbr;
	}
	public void setPanNbr(String panNbr) {
		this.panNbr = panNbr;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
