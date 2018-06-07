package com.test;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MessageHandler extends Thread {
	Socket S;
	BufferedReader in;
	PrintWriter out;
	Scanner scan_in;
	boolean is_receive;
	
	MessageHandler(Socket S, BufferedReader in, PrintWriter out, Person P, boolean is_receive){
		this.S = S;
		this.in = in;
		this.out = out;
		this.is_receive = is_receive;
		if(!is_receive)
			scan_in = new Scanner(System.in);
		start();
	}
	@Override
	public void run() {
		try {
			while(S.isConnected()) {
				if(is_receive) {
					String S = in.readLine();
					System.out.println(S);
				}
				else {
					String S = scan_in.nextLine();
					out.println(S);
				}
			} 
		} catch (IOException e) {e.printStackTrace();}
	}
}
