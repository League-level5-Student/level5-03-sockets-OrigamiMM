package _02_Chat_Application;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp extends JFrame{
	ServerGreeter server;
	ClientGreeter client;
	
	public static void main(String[] args) {
		new ChatApp();
	}
	public ChatApp(){
		int response = JOptionPane.showConfirmDialog(null, "Are you going to host?");
		if(response == JOptionPane.YES_OPTION) {
			try {
				server = new ServerGreeter();
				server.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			client = new ClientGreeter();
			client.run();
		}
	}
}
