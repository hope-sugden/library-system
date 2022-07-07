package com.example.librarysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LibrarySystemApplication {

	Scanner scanner = new Scanner(System.in);
	static List<User> registeredUsers = new ArrayList<>();


	public static void visitLibrary() throws FileNotFoundException {
		Welcome welcomeMessage = new Welcome();
		User user = welcomeMessage.welcome();
		DisplayMenu displayMenu = new DisplayMenu();
		MenuController menuController = new MenuController();
		if (user.getAdmin() == true){
			displayMenu.adminMenu();
			menuController.adminControlMenu(user.getName());
		}else {
			displayMenu.userMenu();
			menuController.userControlMenu(user.getName());
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
//		SpringApplication.run(LibrarySystemApplication.class, args);
		LibrarySystemApplication librarySystemApplication = new LibrarySystemApplication();
		librarySystemApplication.visitLibrary();

	}

}
