package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Friend implements Serializable {

        private int id;
        private String user_name_entry;
        private String friend_name;


        public Friend() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUser_name_entry() {
            return user_name_entry;
        }

        public void setUser_name_entry(String user_name_entry) {
            this.user_name_entry = user_name_entry;
        }

        public String getFriend_name() {
            return friend_name;
        }

        public void setFriend_name(String friend_name) {
            this.friend_name = friend_name;
        }

        @Override
        public String toString() {
            return "Friend [id=" + id + ", user_name_entry=" + user_name_entry + ", friend_name=" + friend_name + "]";
        }

    }

