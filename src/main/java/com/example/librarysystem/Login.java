package com.example.librarysystem;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    LibrarySystemApplication libraryVisit = new LibrarySystemApplication();
    CreateUserAccount createNewAccount = new CreateUserAccount();

    public String login () {
        System.out.println("Please enter your user name");
        String username = scanner.nextLine();
        if(libraryVisit.registeredUsers.contains(username)){
            System.out.println("Welcome back "+username);
            return username;
        }
        else {
            System.out.println("Sorry this is not a registered user. Please create an account.");
            return createNewAccount.createUser();
        }
    }
}
