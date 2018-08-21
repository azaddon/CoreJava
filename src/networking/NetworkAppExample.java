package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class NetworkAppExample {

	public static void main(String[] args) throws Exception {
		//Declaring Server Address
		String host = "localhost";
        int port = 10430;
        
        //Creating Server
        ServerSocket server = new ServerSocket(port, 50, InetAddress.getByName(host));
        System.out.println("Server started.");
        
        //creating client
        Socket client = new Socket(host, port);
        System.out.println("Connecting to server...");
        
        //Establishing Connection
        Socket connection = server.accept();
        System.out.println("Connection established.");
        
        //Preparing Communication Stream
        DataOutputStream clientOut = new DataOutputStream(client.getOutputStream());
        DataInputStream clientIn = new DataInputStream(client.getInputStream());
        DataOutputStream serverOut = new DataOutputStream(connection.getOutputStream());
        DataInputStream serverIn = new DataInputStream(connection.getInputStream());
        System.out.println("Communication is ready.");
        
        //creating Message datastream and //objectstream
        byte[] messageOut = "Hello World".getBytes();
        //String messageOut = "Hello World";
        
        //sending message datastream and //objectstream
        clientOut.writeInt(messageOut.length);
        clientOut.write(messageOut);
        clientOut.flush();
        /*clientOut.writeObject(messageOut);
        clientOut.flush();*/
        
        System.out.println("Message sent to server: " + new String(messageOut));
        //System.out.println("Message sent to server: " + messageOut);
        
        //reading message datastream and //objectstream
        int length = serverIn.readInt();
        if (length > 0) {
            byte[] messageIn = new byte[length];
            serverIn.readFully(messageIn, 0, messageIn.length);
            System.out.println("Message received from client: " + new String(messageIn));
            
        }
        //String messageIn = (String) serverIn.readObject();
      //System.out.println("Message received from client: " + messageIn);
        
       //closing connection
        clientOut.close();
        serverOut.close();
        System.out.println("Connections closed.");
        
        //terminate server
        server.close();
        System.out.println("Server terminated.");
	}

}
