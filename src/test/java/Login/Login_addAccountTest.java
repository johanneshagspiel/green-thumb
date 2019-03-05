package Login;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

public class Login_addAccountTest {
	

	@Test
	public void testEmptyUsernameEmptyPassword() throws AWTException, InterruptedException {
		String username = "";
		String password = "";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		enterPress();
		Login_addAccount.addAccount(textField_1, textPassword);
		enterPress();
	}
	
	/*@Test
	public void testEmptyUsername() throws AWTException {
		String username = "";
		String password = "test";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		Login_addAccount.addAccount(textField_1, textPassword);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	@Test
	public void testEmptyPassword() throws AWTException {
		String username = "test";
		String password = "";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		Login_addAccount.addAccount(textField_1, textPassword);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
*/
	//This command removes messages
	public static void enterPress() throws AWTException, InterruptedException {
		Runnable runnable = new MessageClicker();
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	
}
