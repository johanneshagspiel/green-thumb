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
        private String userNameEntry;
        /** initialises the username. */
        private String friendName;
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
    public final String getuserNameEntry() {
        return userNameEntry;
        }

    /**
     * Sets user name entry.
     *
     * @param userNameEntry the user name entry
     */
    public final void setuserNameEntry(final String userNameEntry) {
        this.userNameEntry = userNameEntry;
        }

    /**
     * Gets friend name.
     * @return the friend name
     */
    public final String getfriendName() {
        return friendName;
        }

    /**
     * Sets friend name.
     * @param friendName the friend name
     */
    public final void setfriendName(final String friendName) {
        this.friendName = friendName;
        }

        @Override
        public final String toString() {
            return "Friend [id=" + id + ", userNameEntry=" + userNameEntry
                    + ", friendName=" + friendName + "]";
        }

    }

