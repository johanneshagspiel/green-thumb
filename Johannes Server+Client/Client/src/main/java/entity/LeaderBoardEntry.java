package entity;

import helper.ComparatorLeaderBoard;
import service.FriendServiceImpl;
import service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

<<<<<<< .merge_file_a18040
/**
 * The type Leader board entry.
 */
=======
>>>>>>> .merge_file_a01520
public class LeaderBoardEntry {

    private String name;
    private int score;

<<<<<<< .merge_file_a18040
    /**
     * Instantiates a new Leader board entry.
     *
     * @param name  the name
     * @param score the score
     */
=======
>>>>>>> .merge_file_a01520
    public LeaderBoardEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

<<<<<<< .merge_file_a18040
    /**
     * Gets name.
     *
     * @return the name
     */
=======
>>>>>>> .merge_file_a01520
    public String getName() {
        return name;
    }

<<<<<<< .merge_file_a18040
    /**
     * Sets name.
     *
     * @param name the name
     */
=======
>>>>>>> .merge_file_a01520
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< .merge_file_a18040
    /**
     * Gets score.
     *
     * @return the score
     */
=======
>>>>>>> .merge_file_a01520
    public int getScore() {
        return score;
    }

<<<<<<< .merge_file_a18040
    /**
     * Sets score.
     *
     * @param score the score
     */
=======
>>>>>>> .merge_file_a01520
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name +", " + score;
    }

<<<<<<< .merge_file_a18040
    /**
     * Create leaderboard string.
     *
     * @param pointsIn   the points in
     * @param usernameIn the username in
     * @return the string
     */
=======
>>>>>>> .merge_file_a01520
    public static String createLeaderboard(int pointsIn, String usernameIn) {


        List<LeaderBoardEntry> listEntries = new ArrayList<LeaderBoardEntry>();

        // adding the user
        LeaderBoardEntry user = new LeaderBoardEntry("You", pointsIn);
        listEntries.add(user);

        // addign the friends
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
