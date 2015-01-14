package com.grapefruitcode.lolAssist.window;

import javax.swing.JFrame;

public class Window extends JFrame {
	loginPanel loginPanel = new loginPanel();
	
	public Window(){
		this.setTitle("LoLAssist");
		this.setVisible(true);
		this.setSize(1080/2, 1080/2);
		this.add(loginPanel);
	}

}
