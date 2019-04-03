/**
 * 
 */
package helper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import entity.User;

/**
 * @author ardyz
 *
 */
public class SortUsernameTest {

	@Test
	public void test() {
		List<User> test = new ArrayList<User>();
		
		User Ardy = new User();
		Ardy.setUser_name("Ardy");
		User Nick = new User();
		Nick.setUser_name("Nick");
		User Giel = new User();
		Giel.setUser_name("Giel");
		User Nathan = new User();
		Nathan.setUser_name("Nathan");
		User Leon = new User();
		Leon.setUser_name("Leon");
		
		test.add(Nathan);
		test.add(Ardy);
		test.add(Nick);
		test.add(Giel);
		test.add(Leon);
		
		Collections.sort(test, new SortUsername());
		System.out.println(test.toString());
		
		assertTrue(test.get(0).getUser_name().equals("Ardy"));
		assertTrue(test.get(1).getUser_name().equals("Giel"));
		assertTrue(test.get(2).getUser_name().equals("Leon"));
		assertTrue(test.get(3).getUser_name().equals("Nathan"));
		assertTrue(test.get(4).getUser_name().equals("Nick"));
	}

}
