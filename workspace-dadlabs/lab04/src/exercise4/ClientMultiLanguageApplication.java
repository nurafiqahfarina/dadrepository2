package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMultiLanguageApplication {

public static void main(String[] args) {
		
		try {
			// Connect to the server at localhost, port 4231
			Socket socket = new Socket(InetAddress.getLocalHost(), 4231);
			
			// Create input stream 
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			// Read from the network and display the current date
			String text = bufferedReader.readLine();
			System.out.println("English " + "        Bahasa Malaysia" + "   Arabic" + "\t   Korean");
			System.out.println("************************************************************");
			System.out.println(text);
			
			// Close everything
			bufferedReader.close();
			socket.close();
			
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
