import java.io.*;
import java.net.ServerSocket;
import java.net.*;
import java.util.Scanner;


/*
*
* this is a raw copy/past from this site:
* https://medium.com/martinomburajr/java-create-your-own-hello-world-server-2ca33b6957e
*
* To start the server, run this Java application
*
* To connect to the server, you need to use a server tool (like telnet)
*
* */



public class ServerTest {

    //Main method for connecting to server
    public static void main(String[] args){
        connectToServer();
    }
    //End of main

    //Server method
    public static void connectToServer() {
        //Try connect to the server on an unused port eg 9991. A successful connection will return a socket
        try (ServerSocket serverSocket = new ServerSocket(9001)) {
            Socket connectionSocket = serverSocket.accept();

            ////Create Input&Outputstreams for the connection
            InputStream inputToServer = connectionSocket.getInputStream();
            OutputStream outputFromServer = connectionSocket.getOutputStream();

            Scanner scanner = new Scanner(inputToServer, "UTF-8");
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"), true);

            serverPrintOut.println("Hello! Enter Peace to exit.");

            //Have the server take input from the client and echo it back
            //This should be placed in a loop that listens for a terminator text e.g. bye
            boolean done = false;


            while(!done && scanner.hasNextLine()) {
                String line = scanner.nextLine();
                serverPrintOut.println("Echo from <Your name Here> Server: " + line);

                if(line.toLowerCase().trim().equals("peace")) {
                    done = true;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
