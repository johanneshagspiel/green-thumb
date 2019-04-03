package helper;

import static org.junit.Assert.*;

import javax.swing.JLabel;
import org.junit.Test;

import GUI.GUI_App;
import entity.User;
import service.UserServiceImpl;

public class UpdatingLabelsTest {

	@Test
	public void testCar() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 200;
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
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 552;
		final int resultTotal_saved = 1109;
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
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = -200;
		final int resultTotal_saved = 900;
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
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 78;
		final int resultTotal_saved = 1009;
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
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = -200;
		final int resultTotal_saved = 700;
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
	
	@Test
	public void testVegetarian() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 679;
		final int resultTotal_saved = 1169;
		GUI_App.setLabel("Vegetarian Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Vegetarian");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testCarnivore() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 452;
		final int resultTotal_saved = 1009;
		GUI_App.setLabel("Vegetarian Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Carnivore");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testLocalProduce() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = -22;
		final int resultTotal_saved = 909;
		GUI_App.setLabel("Produce Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Local Produce");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}
	
	@Test
	public void testGlobalProduce() {
		
		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = clientIn.getUser2("Test");
		userIn.setBike(0);
		userIn.setCar(0);
		userIn.setProduce(0);
		userIn.setPublic_transportation(0);
		userIn.setSolar(0);
		userIn.setTemperature(0);
		userIn.setTotal(0);
		userIn.setTotal_saved(0);
		userIn.setTotal_used(0);
		userIn.setVegetarian(0);
		
		// Adding some user information
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 265;
		final int resultTotal_saved = 1009;
		GUI_App.setLabel("Produce Score");
		
		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, "Global Produce");
		
		// Checking the method
		assertEquals(userIn.getTotal(), resultTotal);
		assertEquals(userIn.getTotal_saved(), resultTotal_saved);
		
	}

}
