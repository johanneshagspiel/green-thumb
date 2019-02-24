package GUI;

import static org.junit.Assert.*;

import org.junit.Test;

public class Login_STest {

	@Test
	public void testInvalidLogin1() {
		String username = "NotNick";
		String password = "NotAPWD";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertFalse("These are not valid credentials, but still grant access", result);
	}
	
	@Test
	public void testInvalidLogin2() {
		String username = "sdfdsghdshdhd";
		String password = " ";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertFalse("These are not valid credentials, but still grant access", result);
	}
	
	@Test
	public void testValidNameInvalidPassword() {
		String username = "Andy";
		String password = "WorkingFair";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertFalse("These are not valid credentials, but still grant access", result);
	}
	
	@Test
	public void testInvalidNameValidPassword() {
		String username = "Somebody";
		String password = "pwd";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertFalse("These are not valid credentials, but still grant access", result);
	}
	
	@Test
	public void testValidLogin1() {
		String username = "Nick";
		String password = "pwd";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertTrue("These are valid credentials, but they don't grant access", result);
	}
	
	@Test
	public void testValidLogin2() {
		String username = "Donald Trump";
		String password = "wall";
		boolean result = Login_S.checkLogin(null, null, username, password);
		assertTrue("These are valid credentials, but they don't grant access", result);
	}

	
}
