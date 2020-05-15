package sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Phone {

	private final Socket socket;
	private final BufferedReader reader;
	private final BufferedWriter writer;
	

	public Phone(Socket socket) {
		this.socket = socket;
		this.reader=creater();
	}

	public Phone(ServerSocket server) {
		this.socket = server.accept();
	}
}
