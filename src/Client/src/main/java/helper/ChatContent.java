package helper;

import entity.User;
import org.apache.commons.lang.ArrayUtils;
import service.UserServiceImpl;

import javax.swing.*;

public class ChatContent {

    public static String createChat(UserServiceImpl clientIn) {

        String oldChatContent = clientIn.getUser(999).getPassword();
        String split[] = oldChatContent.split("SplitHereer");
        String content = "";

        while (split.length > 10)
        {
            split = (String[]) ArrayUtils.removeElement(split, split[0]);
        }

        for (int i = 0; i < split.length; i++)
        {
            content = content + split[i] + "<br/>";
        }

        String chatContent = "<html>" + content + "</html>";

        return chatContent;
    }

    public static void postComment(JTextField chatText, UserServiceImpl clientIn, User userIn, JLabel lblChatContent)
    {
        String userInput = userIn.getUser_name() + ": " + chatText.getText() +"SplitHereer";
        User Placeholder = clientIn.getUser(999);
        String oldChat = Placeholder.getPassword();
        String newChat = oldChat.concat(userInput);
        Placeholder.setPassword(newChat);
        clientIn.updateUser(Placeholder);
        chatText.setText(null);

        lblChatContent.setText(createChat(clientIn));
    }
}
