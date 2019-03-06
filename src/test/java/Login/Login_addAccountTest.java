package Login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import javax.swing.JFrame;
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
		boolean test = Login_addAccount.addAccount(textField_1, textPassword);
		assertFalse(test);
	}
	
	@Test
	public void testEmptyUsername() throws AWTException, InterruptedException {
		String username = "";
		String password = "test";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		boolean test = Login_addAccount.addAccount(textField_1, textPassword);
		assertFalse(test);
	}
	
	@Test
	public void testEmptyPassword() throws AWTException, InterruptedException {
		String username = "test";
		String password = "";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		boolean test = Login_addAccount.addAccount(textField_1, textPassword);
		assertFalse(test);
	}
	
	@Test
	public void testKnownUsername() throws AWTException, InterruptedException {
		String username = "Ardy";
		String password = "Cook";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		boolean test = Login_addAccount.addAccount(textField_1, textPassword);
		assertFalse(test);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testNewUser() throws AWTException, InterruptedException {
		String username = "Neok";
		String password = "Koen";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		boolean test = Login_addAccount.addAccount(textField_1, textPassword);
		assertTrue(test);
		
		//Test if the new account gives access
		JFrame frame = new JFrame();
		String empty = "";
		Login_r.Login_request(username, password, textField_1, textPassword, frame);
		assertTrue(textField_1.getText().equals(empty));
		assertTrue(textPassword.getText().equals(empty));
		
		//Deletes the Neok account after the test
		
	}
	
	public void deleteNewUser() {
		
	}
}
