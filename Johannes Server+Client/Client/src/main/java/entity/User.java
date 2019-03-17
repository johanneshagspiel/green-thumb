package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

<<<<<<< .merge_file_a16632
/**
 * The type User.
 */
=======
>>>>>>> .merge_file_a18036
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

	private int id;
	private String user_name;
	private String password;
	private int vegetarian;
	private int produce;
	private int transportation;
	private int temperature;
	private int solar;


<<<<<<< .merge_file_a16632
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

    /**
     * Gets transportation.
     *
     * @return the transportation
     */
    public int getTransportation() {
		return transportation;
	}

    /**
     * Sets transportation.
     *
     * @param transportation the transportation
     */
    public void setTransportation(int transportation) {
		this.transportation = transportation;
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
=======
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
>>>>>>> .merge_file_a18036
		this.solar = solar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", password=" + password + ", vegetarian=" + vegetarian + ", produce=" + produce + ", transportation=" + transportation + ", temperature=" + temperature + ", solar=" + solar + "]";
	}

}


