package server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type Friend.
 */
@Entity
@Table(name = "friend")

public final class Friend implements Serializable {
    /** Javadoc comment.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    /** Javadoc comment. */
    @Column(name = "userNameEntry")
    private String userNameEntry;
    /** Javadoc comment.*/
    @Column(name = "friendName")
    private String friendName;


    /**
     * Instantiates a new Friend.
     */
    public Friend() {

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
     * Gets user name entry.
     *
     * @return the user name entry
     */
    public String getUserNameEntry() {
        return userNameEntry;
    }

    /**
     * Sets user name entry.
     *
     * @param userNameEntry the user name entry
     */
    public void setUserNameEntry(final String userNameEntry) {
        this.userNameEntry = userNameEntry;
    }

    /**
     * Gets friend name.
     *
     * @return the friend name
     */
    public String getFriendName() {
        return friendName;
    }

    /**
     * Sets friend name.
     *
     * @param friendName the friend name
     */
    public void setFriendName(final String friendName) {
        this.friendName = friendName;
    }

    @Override
    public String toString() {
        return "Friend [id=" + id + ", userNameEntry="
                + userNameEntry + ", friendName="
                + friendName + "]";
    }

}





