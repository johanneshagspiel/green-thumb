package BasicClientServer;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		int number, temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 4000);
		Scanner server = new Scanner(s.getInputStream());
		System.out.println("Enter any integer");
		if(sc.hasNextInt()) {
		number = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(number);
		temp = server.nextInt();
		System.out.println(temp);
		}
	}
}
