package com.prueba.retrofitbasico.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Persona {

	@SerializedName("id")
	@Expose
	private int id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("lastName")
	@Expose
	private String lastName;
	@SerializedName("nickName")
	@Expose
	private String nickName;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Persona(int id, String name, String lastName, String nickName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.nickName = nickName;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	

}