import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class vegetarian {
	private static ArrayList<list> arr;
	 public static void main(String [] args) {
		 
		 Scanner input = null;

			try {
				input = new Scanner(new File("co2.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (input != null) {
				System.out.println("CO2 found");
				System.out.println("Parsing file...");

				parseFile(input);
			}
	      
	    }
	 public static String Username() {
		 String username = "Ardy";
		 return username;
	 }
	 
	 public static void getCO2 (String username) {
		 for(int i = 0; i < arr.size(); i++) {
			list array = arr.get(i);
			if(username == array.getName()) {
				System.out.println(array.getValue());
			}
		 }
		 
	 }
	 
	 public static void parseFile(Scanner input) {
		 String line = "";
			int counter = 1;

			while (input.hasNextLine()) {
				line = input.nextLine();

				if (line == null || line == "") {
					continue;
				}

				Scanner lineNames = new Scanner(line).useDelimiter(":");
				String lineName = lineNames.next();
				int value = lineNames.nextInt();
				
				list array = new list(lineName, value);
				arr.add(array);
				
	 }
}
}