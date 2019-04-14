package helper;

import static org.junit.Assert.*;

import javax.swing.JLabel;
import org.junit.Test;

import GUI.GUI_App;
import entity.User;
import service.UserServiceImpl;

public class UpdatingLabelsTest {

	@Test
	public void testConstructor() {
		
		UpdatingLabels Ardy = new UpdatingLabels();
		
		assertNotNull(Ardy);
	}
	
	@Test
	public void testCar() {

		// Getting the user
		UserServiceImpl clientIn = new UserServiceImpl();
		User userIn = new User();
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
		final int resultTotal = 100;
		GUI_App.setLabel("Car Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, imgMotivation,imgAchievementSaved,imgAchievement, "Car");

		// Checking the method
		assertEquals(userIn.getCar(), resultTotal);

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
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 100;
		GUI_App.setLabel("Public Transportation Score");

		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel,imgMotivation,imgAchievement, imgAchievementSaved, "Public Transportation");

		// Checking the method
		assertEquals(userIn.getPublic_transportation(), resultTotal);

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
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Adding some user information
		final double entry = 10;
		JLabel lblTotalCO2 = new JLabel("");
		JLabel lblCO2Saved = new JLabel("");
		JLabel lblLeaderboardContent = new JLabel("");
		JLabel lblLevel = new JLabel("");
		JLabel lblMotivation = new JLabel("");
		final int resultTotal = 100;
		GUI_App.setLabel("Bike Score");

		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, imgMotivation,imgAchievement, imgAchievementSaved,"Bike");

		// Checking the method
		assertEquals(userIn.getBike(), resultTotal);

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
		final int resultTotal = 100;
		GUI_App.setLabel("Temperature Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel,imgMotivation,imgAchievement, imgAchievementSaved, "Temperature");

		// Checking the method
		assertEquals(userIn.getTemperature(), resultTotal);

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
		final int resultTotal = 100;
		GUI_App.setLabel("Solar Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingTextField(userIn,
				clientIn, entry,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, imgMotivation,imgAchievement, imgAchievementSaved,"Solar");

		// Checking the method
		assertEquals(userIn.getSolar(), resultTotal);

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
		final int resultTotal = 60;
		GUI_App.setLabel("Vegetarian Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel,imgMotivation,imgAchievement, imgAchievementSaved, "Vegetarian");

		// Checking the method
		assertEquals(userIn.getVegetarian(), resultTotal);

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
		final int resultTotal = 0;
		GUI_App.setLabel("Vegetarian Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel, imgMotivation,imgAchievement, imgAchievementSaved,"Carnivore");

		// Checking the method
		assertEquals(userIn.getVegetarian(), resultTotal);

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
		final int resultTotal = 9;
		GUI_App.setLabel("Produce Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel,imgMotivation,imgAchievement, imgAchievementSaved, "Local Produce");

		// Checking the method
		assertEquals(userIn.getProduce(), resultTotal);

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
		final int resultTotal = 0;
		GUI_App.setLabel("Produce Score");
		JLabel imgMotivation = new JLabel("");
		JLabel imgAchievementSaved = new JLabel("");
		JLabel imgAchievement = new JLabel("");

		// Updating the label
		UpdatingLabels.updateEverythingDuo(userIn,
				clientIn,
				lblTotalCO2, lblCO2Saved,
				lblLeaderboardContent,
				lblMotivation, lblLevel,imgMotivation,imgAchievement, imgAchievementSaved, "Global Produce");

		// Checking the method
		assertEquals(userIn.getProduce(), resultTotal);

	}

}
