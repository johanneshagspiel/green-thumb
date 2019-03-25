package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * The type Friend.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Friend implements Serializable {

        private int id;
        private String user_name_entry;
        private String friend_name;


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
    public void setId(int id) {
            this.id = id;
        }

    /**
     * Gets user name entry.
     *
     * @return the user name entry
     */
    public String getUser_name_entry() {
            return user_name_entry;
        }

    /**
     * Sets user name entry.
     *
     * @param user_name_entry the user name entry
     */
    public void setUser_name_entry(String user_name_entry) {
            this.user_name_entry = user_name_entry;
        }

    /**
     * Gets friend name.
     *
     * @return the friend name
     */
    public String getFriend_name() {
            return friend_name;
        }

    /**
     * Sets friend name.
     *
     * @param friend_name the friend name
     */
    public void setFriend_name(String friend_name) {
            this.friend_name = friend_name;
        }

        @Override
        public String toString() {
            return "Friend [id=" + id + ", user_name_entry=" + user_name_entry + ", friend_name=" + friend_name + "]";
        }

    }

