package com.test;
import java.io.*;
import java.net.*;

public class Chat {
	boolean is_server = false;
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("not working");
			System.exit(-1);
			}
		System.out.println("working");
		new Chat(args[0].equals("server"));
	}
	
	Chat(boolean is_server){
		this.is_server = is_server;
		System.out.println((is_server ? "Server" : "Client") + " Start working");
		try {
			ServerSocket Server;
			Socket socket;
			if(is_server) {
				Server= new ServerSocket(8199);
				socket = Server.accept();
			}
			else {
				socket = new Socket("localhost", 8199);
			}
			ObjectInputStream in = null;
			ObjectOutputStream out = null;
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
		    Thread threads[] = new Thread[2];
		    threads[0] = new MessageHandler(socket, in, out, true);
		    threads[1] = new MessageHandler(socket, in, out, false);
	            try {
	                threads[0].join();
	                threads[1].join();
	            } catch (InterruptedException e2) {
	                e2.printStackTrace();
	            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
