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
    /** Initiating the string name. **/
    private String names;
    /** Initiating the score. */
    private int scores;

    /**
     * Instantiates a new Leader board entry.
     *
     * @param name  the name
     * @param score the score
     */
    public LeaderBoardEntry(final String name, final int score) {
        this.names = name;
        this.scores = score;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public final String getName() {
        return names;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public final void setName(final String name) {
        this.names = name;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public final int getScore() {
        return scores;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public final void setScore(final int score) {
        this.scores = score;
    }

    @Override
    public final String toString() {
        return names + ", " + scores;
    }
    /** Returning the name.
     * @param label the label
     * @param userIn the user
     * @return the leaderboard
     */

    public static String createLeaderboard(final User userIn,
                                           final String label) {
        /** Making a new leader board */
        List<LeaderBoardEntry> listEntries = new ArrayList<LeaderBoardEntry>();
        final int a = 10;

        LeaderBoardEntry user = userSupplyEntry(userIn, label);
        listEntries.add(user);

        // adding the friends
        FriendServiceImpl clientFriend = new FriendServiceImpl();
        UserServiceImpl clientUser = new UserServiceImpl();
        List<Friend> friends =
                clientFriend.getFriends(userIn.getUser_name());

        for (int i = 0; i < friends.size(); i++) {
            Friend temp = friends.get(i);
            String nameFriend = temp.getFriend_name();
            User friend = clientUser.getUser2(nameFriend);

            int points = 0;

            if (label.equals("Vegetarian Score")) {
                points = friend.getVegetarian();
            } else if (label.equals("Leaderboard Top 10 CO2 Used")
                    || label.equals("Overall Score")) {
                points = friend.getTotal();
            } else if (label.equals("Produce Score")) {
                points = friend.getProduce();
            } else if (label.equals("Car Score")) {
                points = friend.getCar();
            } else if (label.equals("Public Transportation Score")) {
                points = friend.getPublic_transportation();
            } else if (label.equals("Bike Score")) {
                points = friend.getBike();
            } else if (label.equals("Temperature Score")) {
                points = friend.getTemperature();
            } else if (label.equals("Solar Score")) {
                points = friend.getSolar();
            } else if (label.equals("Overall CO2 Saved")) {
                points = friend.getTotal_saved();

            }




            listEntries.add(new LeaderBoardEntry(nameFriend, points));
        }


        // sort the list
        Collections.sort(listEntries, new ComparatorLeaderBoard());

        userIn.setFriendlist(friends);

        String content = new String();
        for (int i = 0; i < listEntries.size() & i <= a; i++) {
            LeaderBoardEntry temp = listEntries.get(i);
            content = content + "Rank " + (i + 1) + ": "
                    + temp.toString() + "<br/>";
        }

        String LeaderBoardContent = "<html>" + content + "</html>";

        return LeaderBoardContent;
    }

    public static LeaderBoardEntry userSupplyEntry(User userIn, String label){
        if (label.equals("Vegetarian Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getVegetarian());
            return user;
        } else if (label.equals("Leaderboard Top 10 CO2 Used")
                || label.equals("Overall Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getTotal());
            return user;
        } else if (label.equals("Produce Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getProduce());
            return user;
        } else if (label.equals("Car Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getCar());
            return user;
        } else if (label.equals("Public Transportation Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getPublic_transportation());
            return user;
        } else if (label.equals("Bike Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getBike());
            return user;
        } else if (label.equals("Temperature Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getTemperature());
            return user;
        } else if (label.equals("Solar Score")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getSolar());
            return user;
        } else if (label.equals("Overall CO2 Saved")) {
            LeaderBoardEntry user = new LeaderBoardEntry("You",
                    userIn.getTotal_saved());
            return user;
        } else{
            return null;
        }
    }
}
