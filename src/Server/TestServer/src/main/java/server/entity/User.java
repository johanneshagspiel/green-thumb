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
public final class User implements Serializable {
    /** Javadoc comment. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    /** Javadoc comment. */
    @Column(name = "userName")
    private String userName;
    /** Javadoc comment. */
    @Column(name = "password")
    private String password;
    /** Javadoc comment. */
    @Column(name = "vegetarian")
    private int vegetarian;
    /** Javadoc comment. */
    @Column(name = "produce")
    private int produce;
    /** Javadoc comment. */
    @Column(name = "car")
    private int car;
    /** Javadoc comment. */
    @Column(name = "publicTransportation")
    private int publicTransportation;
    /** Javadoc comment. */
    @Column(name = "bike")
    private int bike;
    /** Javadoc comment. */
    @Column(name = "temperature")
    private int temperature;
    /** Javadoc comment. */
    @Column(name = "solar")
    private int solar;
    /** Javadoc comment. */
    @Column(name = "totalSaved")
    private int totalSaved;
    /** Javadoc comment. */
    @Column(name = "toalUsed")
    private int toalUsed;
    /** Javadoc comment. */
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
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(final String userName) {
        this.userName = userName;
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
    public int getPublicTransportation() {
        return publicTransportation;
    }

    /**
     * Sets public transportation.
     *
     * @param publicTransportation the public transportation
     */
    public void setPublicTransportation(final int publicTransportation) {
        this.publicTransportation = publicTransportation;
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
    public int getTotalSaved() {
        return totalSaved;
    }

    /**
     * Sets total saved.
     *
     * @param totalSaved the total saved
     */
    public void setTotalSaved(final int totalSaved) {
        this.totalSaved = totalSaved;
    }

    /**
     * Gets total used.
     *
     * @return the total used
     */
    public int getTotalUsed() {
        return toalUsed;
    }

    /**
     * Sets total used.
     *
     * @param toalUsed the total used
     */
    public void setTotalUsed(final int toalUsed) {
        this.toalUsed = toalUsed;
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
        return "User [id=" + id + ", userName="
                + userName + ", password="
                + password + ", vegetarian="
                + vegetarian + ", produce="
                + produce + ", car=" + car
                + ", publicTransportation="
                + publicTransportation + ", bike="
                + bike + ", temperature=" + temperature
                + ", solar =" + solar + ", totalSaved="
                + totalSaved + ", toalUsed="
                + toalUsed + ", total=" + total + "]";
    }
}





