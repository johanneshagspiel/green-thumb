package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="vegetarian")
	private int vegetarian;

	@Column(name="produce")
	private int produce;

	@Column(name="transportation")
	private int transportation;

	@Column(name="temperature")
	private int temperature;

	@Column(name="solar")
	private int solar;

	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(int vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getProduce() {
		return produce;
	}

	public void setProduce(int produce) {
		this.produce = produce;
	}

	public int getTransportation() {
		return transportation;
	}

	public void setTransportation(int transportation) {
		this.transportation = transportation;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getSolar() {
		return solar;
	}

	public void setSolar(int solar) {
		this.solar = solar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", password=" + password + ", vegetarian=" + vegetarian + ", produce=" + produce + ", transportation=" + transportation + ", temperature=" + temperature + ", solar=" + solar + "]";
	}
		
}





