package sockets;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
try {
	ServerSocket server= new ServerSocket(8000);
	
	System.out.println("Server started");
	Socket socket=server.accept();
	System.out.println("Client connected");
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	writer.write("HELLO FROM SERVER");
	writer.newLine();
	writer.flush();
	
	writer.close();
	socket.close();
	server.close();
	
	
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
