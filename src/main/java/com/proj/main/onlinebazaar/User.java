package com.proj.main.onlinebazaar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "USERNAME", unique = false, nullable = false, length = 100)
	private String username;

	@Column(name = "EMAIL", unique = false, nullable = false, length = 100)
	private String email;

	@Column(name = "NAME", unique = false, nullable = false, length = 100)
	private String name;

	@Column(name = "SURNAME", unique = false, nullable = false, length = 100)
	private String surname;

	public User() {

	}

	public User(Long id, String username, String email, String name, String surname) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.name = name;
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", name=" + name + ", surname="
				+ surname + "]";
	}
}