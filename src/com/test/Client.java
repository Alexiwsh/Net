/*package com.test;
import java.io.*;
import java.net.*;
public class Client {

	public static void main(String[] args) throws InterruptedException {
		try {
			Socket S = new Socket("localhost", Server.PORT);
	        BufferedReader in = new BufferedReader(new InputStreamReader(S.getInputStream()));
	        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(S.getOutputStream())), true);
	        out.println("you connected to client");
	        Thread threads[] = new Thread[2];
	        threads[0] = new MessageHandler(S, in, out, true);
	        threads[1] = new MessageHandler(S, in, out, false);
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
