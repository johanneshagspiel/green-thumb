package helper;

import entity.User;
import org.apache.commons.lang.ArrayUtils;
import service.UserServiceImpl;

import javax.swing.*;
/** The chatcontent. */
public class ChatContent {


    /**
     * The Constructor.
     * Only for testing
     */
    public ChatContent() {

    }

    /**
     * The Chat.
     * @param clientIn the client in
     * @return the string
     */
    public static String createChat(final UserServiceImpl clientIn) {
        final int uservalue = 999;
        final int stringlength = 10;
        String oldChatContent = clientIn.getUser(uservalue).getPassword();
        String split[] = oldChatContent.split("SplitHereer");
        String content = "";

        while (split.length > stringlength) {
            split = (String[]) ArrayUtils.removeElement(split, split[0]);
        }

        for (int i = 0; i < split.length; i++) {
            content = content + split[i] + "<br/>";
        }

        String chatContent = "<html>" + content + "</html>";

        return chatContent;
    }

    /**
     * The comment post.
     * @param chatText the chat text
     * @param clientIn the client in
     * @param userIn the user in
     * @param lblChatContent the chat content
     */
    public static void postComment(final JTextField chatText,
                                   final UserServiceImpl clientIn,
                                   final User userIn,
                                   final JLabel lblChatContent) {
        final int uservalue = 999;
        String userInput = userIn.getUser_name() + ": "
                + chatText.getText() + "SplitHereer";
        User Placeholder = clientIn.getUser(uservalue);
        String oldChat = Placeholder.getPassword();
        String newChat = oldChat.concat(userInput);
        Placeholder.setPassword(newChat);
        clientIn.updateUser(Placeholder);
        chatText.setText(null);

        lblChatContent.setText(createChat(clientIn));
    }
}
