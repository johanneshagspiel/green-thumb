package helper;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.Test;

import GUI.GUI_App;
import Login.Login_r;
import entity.User;
import service.UserServiceImpl;

public class UpdatingLabelsTest {

	@Test
	public void testCar() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setCar(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 27100;
		final int resultTotal_saved = 0;
		GUI_App.setLabel("Car Score");
		
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
	
	@Test
	public void testPublicTransport() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setPublic_transportation(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 38800;
		final int resultTotal_saved = 42500;
		GUI_App.setLabel("Public Transportation Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Public Transportation");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testBike() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 28700;
		final int resultTotal_saved = 25500;
		GUI_App.setLabel("Bike Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Bike");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testTemperature() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 28700;
		final int resultTotal_saved = 25500;
		GUI_App.setLabel("Temperature Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Temperature");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testSolar() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setSolar(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		
		// Adding some user information
		final double entry = 1000;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 28700;
		final int resultTotal_saved = 25500;
		GUI_App.setLabel("Solar Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Solar");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}

}
