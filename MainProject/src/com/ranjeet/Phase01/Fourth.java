package com.ranjeet.Phase01;

public class Fourth  {

	public static void main(String[] args) {
		
		VirtualKey.createMainFolderIfNotPresent("main");

		Third.printWelcomeScreen("Birla Software Pvt. Ltd", "Ranjeet Thakur");

		Second.handleWelcomeScreenInput();
	}

}