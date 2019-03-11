package Login;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.junit.Test;

public class BasicServerTest {

	//Test server startup
	/*
	@Test
	public void testConnectToServer() {
		BasicServer.connectToServer();
		assert();
	} */
	
	//Test nameChange method
	@Test
	public void testNameChange() throws UnsupportedEncodingException, FileNotFoundException {
		BasicServer.name = "NotNick";
			
		ByteArrayInputStream in = new ByteArrayInputStream("Nick".getBytes());
		System.setIn(in);	
		Scanner scanner = new Scanner(System.in);	
			
		PrintWriter serverPrintOut = new PrintWriter(new File("testwrites.txt")); //How can I initialize this correctly?
		
		BasicServer.nameChange(scanner, serverPrintOut);
		assertEquals("Name change doesn't work correctly", BasicServer.name, "Nick");
	} 
	
	//Test end command
	@Test
	public void testCommandEnd() throws FileNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream("end".getBytes());
		System.setIn(in);
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter serverPrintOut = new PrintWriter(new File("testwrites.txt"));
		BasicServer.selectCommand(scanner, serverPrintOut);
	} 
	
	
	
	

}
