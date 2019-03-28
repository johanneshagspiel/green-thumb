package entity;

import helper.ComparatorLeaderBoard;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The type Leader board entry.
 */
public class LeaderBoardEntry {

    private String name;
    private int score;

    /**
     * Instantiates a new Leader board entry.
     *
     * @param name  the name
     * @param score the score
     */
    public LeaderBoardEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name +", " + score;
    }

    /**
     * Create leaderboard string.
     *
     * @param pointsIn   the points in
     * @param usernameIn the username in
     * @return the string
     */
    public static String createLeaderboard(int pointsIn, String usernameIn, User userIn) {


        List<LeaderBoardEntry> listEntries = new ArrayList<LeaderBoardEntry>();

        // adding the user
        LeaderBoardEntry user = new LeaderBoardEntry("You", pointsIn);
        listEntries.add(user);

        // adding the friends
        FriendServiceImpl clientFriend = new FriendServiceImpl();
        UserServiceImpl clientUser = new UserServiceImpl();
        List<Friend> friends = clientFriend.getFriends(usernameIn);

        for(int i =0; i < friends.size(); i++)
        {
            Friend temp = friends.get(i);
            String nameFriend = temp.getFriend_name();
            User friend = clientUser.getUser2(nameFriend);
            int points = friend.getProduce() + friend.getSolar() + friend.getVegetarian() + friend.getTransportation() + friend.getTemperature();
            listEntries.add(new LeaderBoardEntry(nameFriend, points));
        }


        // sort the list
        Collections.sort(listEntries, new ComparatorLeaderBoard());

        userIn.setFriendlist(friends);

        String content = new String();
        for(int i =0; i < listEntries.size() & i <= 10; i++)
        {
            LeaderBoardEntry temp = listEntries.get(i);
            content = content + "Rank " + (i +1) + ": " + temp.toString() + "<br/>";
        }

        String LeaderBoardContent = "<html>" + content +"</html>";


        return LeaderBoardContent;
    }
}
