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
	Boolean isAdmin = false;
	List<String> registeredUsers = new ArrayList<>();

	public Boolean getAdmin() {
		return isAdmin;
	}

	public void setAdmin(Boolean admin) {
		isAdmin = admin;
	}

	public void visitLibrary() throws FileNotFoundException {
		Welcome welcomeMessage = new Welcome();
		String name = welcomeMessage.welcome();
		DisplayMenu displayMenu = new DisplayMenu();
		MenuController menuController = new MenuController();
		if (isAdmin == true){
			displayMenu.adminMenu();
			menuController.adminControlMenu(name);
		}else {
			displayMenu.userMenu();
			menuController.userControlMenu(name);
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
//		SpringApplication.run(LibrarySystemApplication.class, args);
		LibrarySystemApplication librarySystemApplication = new LibrarySystemApplication();
		librarySystemApplication.visitLibrary();

	}

}
