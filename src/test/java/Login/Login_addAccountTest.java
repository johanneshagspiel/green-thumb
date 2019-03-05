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
		MessageClicker.main(null);
		Login_addAccount.addAccount(textField_1, textPassword);
	}
	
	@Test
	public void testEmptyUsername() throws AWTException, InterruptedException {
		String username = "";
		String password = "test";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		Login_addAccount.addAccount(textField_1, textPassword);		
	}
	
	@Test
	public void testEmptyPassword() throws AWTException, InterruptedException {
		String username = "test";
		String password = "";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		Login_addAccount.addAccount(textField_1, textPassword);
	}	
}
