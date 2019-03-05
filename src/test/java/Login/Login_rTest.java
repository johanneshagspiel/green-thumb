package Login;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.junit.Test;

public class Login_rTest {
	
	@Test
	public void testEmpty() {
		String username = "";
		String password = "";
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, null);
		assertTrue(textField_1.getText().equals(username));
		assertTrue(textPassword.getText().equals(password));
		assertFalse(test);
	}
	
	@Test
	public void testInvalidLogin1() {
		String username = "NotNick";
		String password = "NotAPWD";
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, null);
		assertTrue(textField_1.getText().equals(username));
		assertTrue(textPassword.getText().equals(password));
		assertFalse(test);
	}
	
	@Test
	public void testInvalidLogin2() {
		String username = "sdfdsghdshdhd";
		String password = " ";
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, null);
		assertTrue(textField_1.getText().equals(username));
		assertTrue(textPassword.getText().equals(password));
		assertFalse(test);
	}
	
	@Test
	public void testValidNameInvalidPassword() {
		String username = "Ardy";
		String password = "WorkingFair";
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, null);
		assertTrue(textField_1.getText().equals(username));
		assertTrue(textPassword.getText().equals(password));
		assertFalse(test);
	}
	
	@Test
	public void testInvalidNameValidPassword() {
		String username = "Somebody";
		String password = "Cookie";
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, null);
		assertTrue(textField_1.getText().equals(username));
		assertTrue(textPassword.getText().equals(password));
		assertFalse(test);
	}
	
	@Test
	public void testValidLogin1() {
		String username = "Ardy";
		String password = "Cookie";
		String empty = "";
		JFrame frame = new JFrame();
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, frame);
		assertTrue(textField_1.getText().equals(empty));
		assertTrue(textPassword.getText().equals(empty));
		assertTrue(test);
	}
	
	@Test
	public void testValidLogin2() {
		String username = "Nick";
		String password = "pwd";
		String empty = "";
		JFrame frame = new JFrame();
		JTextField textField_1 = new JTextField(username);
		JTextField textPassword = new JTextField(password);
		MessageClicker.main(null);
		boolean test = Login_r.Login_request(username, password, textField_1, textPassword, frame);
		assertTrue(textField_1.getText().equals(empty));
		assertTrue(textPassword.getText().equals(empty));
		assertTrue(test);
	}

}
