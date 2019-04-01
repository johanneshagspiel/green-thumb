package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type User.
 */
@Entity
@Table(name="user")
public class User implements Serializable{

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

	@Column(name="car")
	private int car;

	@Column(name="public_transportation")
	private int public_transportation;

	@Column(name="bike")
	private int bike;

	@Column(name="temperature")
	private int temperature;

	@Column(name="solar")
	private int solar;

	@Column(name="total_saved")
	private int total_saved;

	@Column(name="total_used")
	private int total_used;

	@Column(name="total")
	private int total;
	/**
	 * Instantiates a new User.
	 */
	public User() {
		
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets user name.
	 *
	 * @return the user name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * Sets user name.
	 *
	 * @param user_name the user name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * Gets password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets vegetarian.
	 *
	 * @return the vegetarian
	 */
	public int getVegetarian() {
		return vegetarian;
	}

	/**
	 * Sets vegetarian.
	 *
	 * @param vegetarian the vegetarian
	 */
	public void setVegetarian(int vegetarian) {
		this.vegetarian = vegetarian;
	}

	/**
	 * Gets produce.
	 *
	 * @return the produce
	 */
	public int getProduce() {
		return produce;
	}

	/**
	 * Sets produce.
	 *
	 * @param produce the produce
	 */
	public void setProduce(int produce) {
		this.produce = produce;
	}

	public int getCar() {
		return car;
	}

	public void setCar(int car) {
		this.car = car;
	}

	public int getPublic_transportation() {
		return public_transportation;
	}

	public void setPublic_transportation(int public_transportation) {
		this.public_transportation = public_transportation;
	}

	public int getBike() {
		return bike;
	}

	public void setBike(int bike) {
		this.bike = bike;
	}

	public int getTotal_saved() {
		return total_saved;
	}

	public void setTotal_saved(int total_saved) {
		this.total_saved = total_saved;
	}

	public int getTotal_used() {
		return total_used;
	}

	public void setTotal_used(int total_used) {
		this.total_used = total_used;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * Gets temperature.
	 *
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * Sets temperature.
	 *
	 * @param temperature the temperature
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	/**
	 * Gets solar.
	 *
	 * @return the solar
	 */
	public int getSolar() {
		return solar;
	}

	/**
	 * Sets solar.
	 *
	 * @param solar the solar
	 */
	public void setSolar(int solar) {
		this.solar = solar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", password=" + password + ", vegetarian=" + vegetarian + ", produce=" + produce + ", car=" + car + ", public_transportation=" + public_transportation + ", bike=" + bike + ", temperature=" + temperature + ", solar =" + solar + ", total_saved=" + total_saved + ", total_used=" + total_used  + ", total=" + total + "]";
	}
		
}





