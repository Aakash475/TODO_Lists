package com.nit.hk.model;

import java.time.LocalDate;

public class Todo {
	private Long id;
	private String title;
	private String description;
	private String username;

	protected Todo() {}

	public Todo(long id, String title, String description, String username) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.username = username;
	}

	public Todo(String title, String description,String username) {
		super();
		this.title = title;
		this.description = description;
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
