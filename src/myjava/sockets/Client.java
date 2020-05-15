package sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 8000);

				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));

		) {

			System.out.println("Connected to server");
			String request = reader.readLine();
			System.out.println("request " + request);
			String response = (int) (Math.random() * 30 - 10) + "";
			System.out.println("response " + response);
			writer.write(request);
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
