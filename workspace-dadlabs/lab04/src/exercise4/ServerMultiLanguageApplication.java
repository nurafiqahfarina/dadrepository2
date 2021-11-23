package exercise4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMultiLanguageApplication {

	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		
		try {
			int portNo = 4231;
			serverSocket = new ServerSocket(portNo);
			
			String text1 = "Good Morning" + "\t Selamat Pagi" + "\t Sobahul Khair" + "\t Joh-Eun Achim" + "\n";
			System.out.println("Waiting for request");
			
			
			while(true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Create stream to write data on the network
				DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
				
				//Send current date back to the client
				outputStream.writeUTF(text1);
				
				//close socket
				clientSocket.close();
			}
			
			//Closing is not necessary because the code is unreachable
			
		}catch (IOException ioe) {
			
			if(serverSocket !=null) 
				serverSocket.close();
			
			ioe.printStackTrace();
		}
			
	}

}
