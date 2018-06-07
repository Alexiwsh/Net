/*package com.test;
import java.io.*;
import java.net.*;
public class Server {

	public static int PORT = 8189;
	public static void main(String[] args) {
		try {
			ServerSocket Server = new ServerSocket(PORT);
			Socket socket = Server.accept();
			 BufferedReader in = new BufferedReader(new InputStreamReader(
	                  socket.getInputStream()));
			 PrintWriter out = new PrintWriter(new BufferedWriter(
	                  new OutputStreamWriter(socket.getOutputStream())), true);
			 out.println("you connected to server");
		     Thread threads[] = new Thread[2];
		    // threads[0] = new MessageHandler(socket, in, out, true);
		    // threads[1] = new MessageHandler(socket, in, out, false);
	            try {
	                threads[0].join();
	                threads[1].join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}*/
