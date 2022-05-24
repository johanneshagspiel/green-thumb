package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * The type Friend.
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Friend implements Serializable {
    /** New public class for Friend.
     */

        private int id;
        /** initialises id .*/
        private String user_name_entry;
        /** initialises the username. */
        private String friend_name;
        /** initialises the friend name.*/


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
    public final int getId() {
        return id;
        }

    /**
     * Sets id.
     * @param id the id
     */
    public final void setId(final int id) {
            this.id = id;
        }

    /**
     * Gets user name entry.
     *
     * @return the user name entry
     */
    public final String getUser_name_entry() {
        return user_name_entry;
        }

    /**
     * Sets user name entry.
     *
     * @param user_name_entry the user name entry
     */
    public final void setUser_name_entry(final String user_name_entry) {
        this.user_name_entry = user_name_entry;
        }

    /**
     * Gets friend name.
     * @return the friend name
     */
    public final String getFriend_name() {
        return friend_name;
        }

    /**
     * Sets friend name.
     * @param friend_name the friend name
     */
    public final void setFriend_name(final String friend_name) {
        this.friend_name = friend_name;
        }

        @Override
        public final String toString() {
            return "Friend [id=" + id + ", user_name_entry=" + user_name_entry
                    + ", friend_name=" + friend_name + "]";
        }

    }

