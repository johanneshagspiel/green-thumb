package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * The type User.
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
	/** Initialise a user.
	 * @param id the user id
	 * @param user_name the users name
	 * @param password the users password
	 * @param vegetarian the amount of vegetarian meals
	 * @param produce the amount of produce
	 * @param car the amount of the car
	 * @param public_transportation the amount of the bus
	 * @param bike the amount of the bike
	 * @param temperature the degrees celsius
	 * @param solar the amount of solar panels
	 * @param total_saved the amount we saved
	 * @param total_used the amount we used
	 * @param total the entire total
	 */
	private int id;
	private String user_name;
	private String password;
	private int vegetarian;
	private int produce;
	private int car;
	private int public_transportation;
	private int bike;
	private int temperature;
	private int solar;
	private int total_saved;
	private int total_used;
	private int total;
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
     * @return produce
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

	public List<Friend> getFriendlist() {
		return friendlist;
	}

	public void setFriendlist(List<Friend> friendlist) {
		this.friendlist = friendlist;
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


