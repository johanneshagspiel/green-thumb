import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[] args) throws IOException {
		int number, temp;
		ServerSocket ss = new ServerSocket(4000);
		Socket s1 = ss.accept();
		Scanner sc = new Scanner(s1.getInputStream());
		number = sc.nextInt();
		
		temp = number * 2;
		
		PrintStream p = new PrintStream(s1.getOutputStream());
		p.println(temp);
	}
}
