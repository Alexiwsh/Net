package com.test;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MessageHandler extends Thread {
	Socket S;
	ObjectInputStream in;
	ObjectOutputStream out;
	Scanner scan_in;
	boolean is_receive;
	
	MessageHandler(Socket S, ObjectInputStream in, ObjectOutputStream out, boolean is_receive){
		this.S = S;
		this.in = in;
		this.out = out;
		this.is_receive = is_receive;
		scan_in = new Scanner(System.in);
		start();
	}
	@Override
	public void run() {
		try {
			while(S.isConnected()) {
				if(is_receive) {
					Person p = (Person) in.readObject();
					
					System.out.println("\nYOU RECEIVED MESSAGE: " + p + "\n");
				}
				else {
					System.out.print("Enter your name: ");
					String name = scan_in.nextLine();
					System.out.print("Enter your age: ");
					int age = scan_in.nextInt();
					out.writeObject(new Person(name, age));
				}
			} 
		} catch (IOException | ClassNotFoundException e) {e.printStackTrace();}
	}
}
