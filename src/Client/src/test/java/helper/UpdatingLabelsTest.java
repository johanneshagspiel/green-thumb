package helper;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.Test;

import Login.Login_r;
import entity.User;
import service.UserServiceImpl;

public class UpdatingLabelsTest {

	@Test
	public void test() {
		
		// Getting the user
		String username = "Test";
		String password = "pwd";
		User userIn = new User();
		UserServiceImpl clientIn = new UserServiceImpl();
		JTextField textField_1 = null;
		JTextField txtPassword = null;
		JFrame frame = null;
		userIn.setCar(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Login in the user
//		Login_r.Login_request(username, password,
//				userIn, clientIn,
//				textField_1, txtPassword, frame);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("1243");
		JLabel lblCO2Saved = new JLabel("100");
		JLabel lblLeaderboardContent = null;
		JLabel lblLevel = new JLabel("1");
		JLabel lblMotivation = new JLabel("Hi");
		final int resultTotal = 271;
		final int resultTotal_saved = 0;
		
		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Car");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}

}
