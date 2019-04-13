package helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import service.UserServiceImpl;
import entity.User;

import javax.swing.*;

import static helper.ChatContent.createChat;
import static helper.ChatContent.postComment;
import static org.junit.Assert.*;

public class ChatContentTest {
    private User chatcontent = null;
    private UserServiceImpl userService = new UserServiceImpl();

    /*
        saves what you hate in your chat
        and overwrites it with the test chat
     */
    @Before
    public void saveChatContent(){
        chatcontent = userService.getUser(999);
        User testUser = new User();
        testUser.setId(999);
        testUser.setUser_name("Global Chat");
        String chat = "Global Chat: Be the first to post in the chat!" +
                "SplitHereer" +
                "Lukas: HelloSplitHereer" +
                "Karel: Hi, how much CO2 did you save?SplitHereer" +
                "Lukas: 69kilo's!SplitHereer" +
                "Karel: Ha, noob, I saved 420 kilo'sSplitHereer" +
                "Lukas: dayumnSplitHereer";
        testUser.setPassword(chat);
        userService.updateUser(testUser);
    }

    @After
    public void restoreChatContent(){
        userService.updateUser(chatcontent);
        chatcontent = null;
    }

    @Test
    public void testCreateChat(){
        String expected = "<html>Global Chat: Be the first to post in" +
                " the chat!<br/>Lukas: Hello<br/>Karel: Hi, how much" +
                " CO2 did you save?<br/>Lukas: 69kilo's!<br/>Karel: " +
                "Ha, noob, I saved 420 kilo's<br/>Lukas: dayumn<br/></html>";
        String actual = createChat(userService);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateChatNull(){
        String actual = createChat(null);
    }

    @Test
    public void testCreateChatLongConversation(){
        User testUser = new User();
        testUser.setId(999);
        testUser.setUser_name("Global Chat");
        String chat = "Global Chat: Be the first to post in the chat!" +
                "SplitHereer" +
                "Lukas: HelloSplitHereer" +
                "Karel: Hi, how much CO2 did you save?SplitHereer" +
                "Lukas: 69kilo's!SplitHereer" +
                "Karel: Ha, noob, I saved 420 kilo'sSplitHereer" +
                "Lukas: dayumnSplitHereer" +
                "Lukas: But I spent lessSplitHereer" +
                "Karel: That doesn't matterSplitHereer" +
                "Lukas: You only care about points huh?SplitHereer" +
                "Karel: ofcourse, you don't?SplitHereer" +
                "Lukas: I try to save the worldSplitHereer" +
                "Karel: Keep dreaming scrubSplitHereer";
        testUser.setPassword(chat);
        userService.updateUser(testUser);
        String actual = createChat(userService);
        String expected = "<html>Karel: Hi, how much CO2 did you save?" +
                "<br/>Lukas: 69kilo's!<br/>Karel: Ha, noob, I saved" +
                " 420 kilo's<br/>Lukas: dayumn<br/>Lukas: But I spent" +
                " less<br/>Karel: That doesn't matter<br/>Lukas: You " +
                "only care about points huh?<br/>Karel: ofcourse, you " +
                "don't?<br/>Lukas: I try to save the world<br/>Karel:" +
                " Keep dreaming scrub<br/></html>";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPostComment(){
        final JTextField textfield = new JTextField();
        User userIn = userService.getUser2("Test");
        final JLabel lblChatContent = new JLabel();
        textfield.setText("Oy mate");
        postComment(textfield, userService, userIn, lblChatContent);
        String expected = "<html>Global Chat: Be the first to post" +
                " in the chat!<br/>Lukas: Hello<br/>Karel: Hi, how" +
                " much CO2 did you save?<br/>Lukas: 69kilo's!<br/>Karel:" +
                " Ha, noob, I saved 420 kilo's<br/>Lukas: dayumn<br/>" +
                "Test: Oy mate<br/></html>";
        assertEquals(expected, lblChatContent.getText());
    }

    @Test
    public void testConstructor() {
        assertNotNull(new ChatContent());
    }
}
