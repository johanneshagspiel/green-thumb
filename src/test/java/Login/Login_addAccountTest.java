package Login;

import java.awt.AWTException;
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
	
	@Test
	public void testKnownUsername() throws AWTException, InterruptedException {
		String username = "Ardy";
		String password = "Cook";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		Login_addAccount.addAccount(textField_1, textPassword);
	}
	
	@Test
	public void testNewUser() throws AWTException, InterruptedException {
		String username = "Neok";
		String password = "Koen";
		JTextField textField_1 = new JTextField(username);
		JPasswordField textPassword = new JPasswordField(password);
		MessageClicker.main(null);
		Login_addAccount.addAccount(textField_1, textPassword);
	}
}
