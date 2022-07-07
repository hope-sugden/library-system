package com.example.librarysystem;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    LibrarySystemApplication libraryVisit = new LibrarySystemApplication();
    CreateUserAccount createNewAccount = new CreateUserAccount();

    public User login () {
        System.out.println("Please enter your user name");
        System.out.println((LibrarySystemApplication.registeredUsers));
        String username = scanner.nextLine();
            User currentUser = null;
            for (User user: LibrarySystemApplication.registeredUsers ) {
                if(user.getName().equals(username)){
                    System.out.println("Welcome back "+username);
                    currentUser = user;
                    return currentUser;
                }
                
            }
        System.out.println("Sorry this is not a registered user. Please create an account.");
        return createNewAccount.createUser();
        }



    }

