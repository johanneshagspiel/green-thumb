package helper;

public class ServerConfig {

    //declaring the variables
    private static String homepage = "https://area22gogreen.herokuapp.com";
    private static String apipage = homepage + "/api/";
    private static String userpage = apipage + "users/";
    private static String friendspage = apipage + "friends/";
    private static String friendpage = apipage + "friend/";

    /**
     * Returning the correct homepage URL for the TomCat instance the app should connect to.
     * @return The URL of the homepage.
     */
    public static String getHomepageURL() {
        return homepage;
    }

    /**
     * Returning the correct API URL for the TomCat instance the app should connect to.
     * @return The URL of the API.
     */
    public static String getAPIURL() {
        return apipage;
    }

    /**
     * Returning the correct userpage URL for the TomCat instance the app should connect to.
     * @return The URL of the userpage.
     */
    public static String getUserpageURL() {
        return userpage;
    }

    /**
     * Returning the correct friendspage URL for the TomCat instance the app should connect to.
     * @return The URL of the friendspage.
     */
    public static String getFriendspageURL() {
        return friendspage;
    }

    /**
     * Returning the correct friendpage URL for the TomCat instance the app should connect to.
     * @return The URL of the friendpage.
     */
    public static String getFriendpageURL() {
        return friendpage;
    }

}