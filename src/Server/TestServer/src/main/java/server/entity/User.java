package server.entity;

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
@Table(name = "user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "password")
	private String password;
	@Column(name = "vegetarian")
	private int vegetarian;
	@Column(name = "produce")
	private int produce;
	@Column(name = "car")
	private int car;
	@Column(name = "public_transportation")
	private int public_transportation;
	@Column(name = "bike")
	private int bike;
	@Column(name = "temperature")
	private int temperature;
	@Column(name = "solar")
	private int solar;
	@Column(name = "total_saved")
	private int total_saved;
	@Column(name = "total_used")
	private int total_used;
	@Column(name = "total")
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
	public void setId(final int id) {
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
	public void setUser_name(final String user_name) {
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
	public void setPassword(final String password) {
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
	public void setVegetarian(final int vegetarian) {
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
	public void setProduce(final int produce) {
		this.produce = produce;
	}

	/**
	 * Gets car.
	 *
	 * @return the car
	 */
	public int getCar() {
		return car;
	}

	/**
	 * Sets car.
	 *
	 * @param car the car
	 */
	public void setCar(final int car) {
		this.car = car;
	}

	/**
	 * Gets public transportation.
	 *
	 * @return the public transportation
	 */
	public int getPublic_transportation() {
		return public_transportation;
	}

	/**
	 * Sets public transportation.
	 *
	 * @param public_transportation the public transportation
	 */
	public void setPublic_transportation(final int public_transportation) {
		this.public_transportation = public_transportation;
	}

	/**
	 * Gets bike.
	 *
	 * @return the bike
	 */
	public int getBike() {
		return bike;
	}

	/**
	 * Sets bike.
	 *
	 * @param bike the bike
	 */
	public void setBike(final int bike) {
		this.bike = bike;
	}

	/**
	 * Gets total saved.
	 *
	 * @return the total saved
	 */
	public int getTotal_saved() {
		return total_saved;
	}

	/**
	 * Sets total saved.
	 *
	 * @param total_saved the total saved
	 */
	public void setTotal_saved(final int total_saved) {
		this.total_saved = total_saved;
	}

	/**
	 * Gets total used.
	 *
	 * @return the total used
	 */
	public int getTotal_used() {
		return total_used;
	}

	/**
	 * Sets total used.
	 *
	 * @param total_used the total used
	 */
	public void setTotal_used(final int total_used) {
		this.total_used = total_used;
	}

	/**
	 * Gets total.
	 *
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Sets total.
	 *
	 * @param total the total
	 */
	public void setTotal(final int total) {
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
	public void setTemperature(final int temperature) {
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
	public void setSolar(final int solar) {
		this.solar = solar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name="
				+ user_name + ", password="
				+ password + ", vegetarian="
				+ vegetarian + ", produce="
				+ produce + ", car=" + car
				+ ", public_transportation="
				+ public_transportation + ", bike="
				+ bike + ", temperature=" + temperature
				+ ", solar =" + solar + ", total_saved="
				+ total_saved + ", total_used="
				+ total_used  + ", total=" + total + "]";
	}
}





