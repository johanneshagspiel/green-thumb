package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/** The type User.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
	/** Initialises a user. */
	private int id;
	/** Initialise the id. */
	private String user_name;
	/** Initialise the username. */
	private String password;
	/** Initialise the password. */
	private int vegetarian;
	/** Initialise the vegetarian counter. */
	private int produce;
	/** Initialise the produce counter. */
	private int car;
	/** Initialise the car counter. */
	private int public_transportation;
	/** Initialise the public counter. */
	private int bike;
	/** Initialise the bike counter. */
	private int temperature;
	/** Initialise the temperature counter. */
	private int solar;
	/** Initialise the solar counter. */
	private int total_saved;
	/** Initialise the total saved counter. */
	private int total_used;
	/** Initialise the total used counter. */
	private int total;
	/** Initialise the total counter. */
	private List<Friend> friendlist;


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
    public final int getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public final  void setId(final int id) {
		this.id = id;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public final String getUser_name() {
		return user_name;
	}

    /**
     * Sets user name.
     *
     * @param user_name the user name
     */
    public final void setUser_name(final String user_name) {
		this.user_name = user_name;
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public final String getPassword() {
		return password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public final void setPassword(final String password) {
		this.password = password;
	}

    /**
     * Gets vegetarian.
     *
     * @return the vegetarian
     */
    public final int  getVegetarian() {
		return vegetarian;
	}

    /**
     * Sets vegetarian.
     *
     * @param vegetarian the vegetarian
     */
    public final void setVegetarian(final int vegetarian) {
		this.vegetarian = vegetarian;
	}

    /**
     * Gets produce.
     *
     * @return produce
     */
    public final int getProduce() {
		return produce;
	}

    /**
     * Sets produce.
     *
     * @param produce the produce
     */
    public final void setProduce(final int produce) {
		this.produce = produce;
	}

	/**  Gets temperature.
	 *
	 * @return produce
	 */
    public final int getTemperature() {
		return temperature;
	}

    /**
     * Sets temperature.
     *
     * @param temperature the temperature
     */
    public final void setTemperature(final int temperature) {
		this.temperature = temperature;
	}

    /**
     * Gets solar.
     *
     * @return the solar
     */
    public final int getSolar() {
		return solar;
	}

	/**
	 * Gets Friendlist.
	 * @return friendlist
	 */
	public final List<Friend> getFriendlist() {
		return friendlist;
	}

	/**
	 * Set the Friendlist.
	 * @param friendlist the friendlist
	 */
	public final void setFriendlist(final List<Friend> friendlist) {
		this.friendlist = friendlist;
	}

	/**
	 * Gets car.
	 * @return car
	 */
	public final int getCar() {
		return car;
	}

	/**
	 * Set the car.
	 * @param car the car
	 */
	public final void setCar(final int car) {
		this.car = car;
	}

	/**
	 * Gets Public_transportation.
	 * @return public_transportation
	 */
	public final int getPublic_transportation() {
		return public_transportation;
	}

	/**
	 * Set the Public_transportation.
	 * @param public_transportation the public transportation
	 */
	public final void setPublic_transportation(
			final int public_transportation) {
		this.public_transportation = public_transportation;
	}

	/**
	 * Gets Bike.
	 * @return Bike
	 */
	public final int getBike() {
		return bike;
	}

	/**
	 * Set the Bike.
	 * @param bike the bike
	 */
	public final void setBike(final int bike) {
		this.bike = bike;
	}

	/**
	 * Gets Total_saved.
	 * @return total_saved
	 */
	public final int getTotal_saved() {
		return total_saved;
	}

	/**
	 * Set the Total_saved.
	 * @param total_saved the total saved
	 */
	public final void setTotal_saved(final int total_saved) {
		this.total_saved = total_saved;
	}

	/**
	 * Gets Total_used.
	 * @return total_used
	 */

	public final int getTotal_used() {
		return total_used;
	}

	/**
	 * Set the Total_used.
	 * @param total_used the total used
	 */
	public final void setTotal_used(final int total_used) {
		this.total_used = total_used;
	}

	/**
	 * Gets Total.
	 * @return total
	 */
	public final int  getTotal() {
		return total;
	}

	/**
	 * Set the Total.
	 * @param total the total
	 */
	public final void setTotal(final int total) {
		this.total = total;
	}

	/**
     * Sets solar.
     *
     * @param solar the solar
     */
    public final void setSolar(final int solar) {
		this.solar = solar;
	}

	/**
	 * Get the String.
	 * @return string
	 */
	@Override
	public final String toString() {
		return "User [id=" + id + ", user_name="
				+ user_name + ", password="
				+ password + ", vegetarian="
				+ vegetarian
				+ ", produce="
				+ produce + ", car="
				+ car + ", public_transportation="
				+ public_transportation
				+ ", bike=" + bike
				+ ", temperature="
				+ temperature + ", solar ="
				+ solar + ", total_saved="
				+ total_saved
				+ ", total_used="
				+ total_used
				+ ", total=" + total + "]";
	}

}


