package com.example.librarysystem;

import java.util.Scanner;

public class CreateUserAccount {
    Scanner scanner = new Scanner(System.in);
    LibrarySystemApplication libraryVisit = new LibrarySystemApplication();
    public User createUser() {
        System.out.println("Please enter a username");
        String username = scanner.nextLine();
        System.out.println("Are you admin? y/n");
        String answer = scanner.nextLine();
        if(answer.toLowerCase().equals("y")){
            User newAdmin = new User(username,true);
            LibrarySystemApplication.registeredUsers.add(newAdmin);
            System.out.println("Hi "+ username + ", thanks for creating an admin account. Welcome to the library.");
            return newAdmin;
        } else if (answer.toLowerCase().equals("n")) {
            User newUser = new User(username,false);
            LibrarySystemApplication.registeredUsers.add(newUser);
            System.out.println("Hi "+ username + ", thanks for creating an account. Welcome to the library.");
            return newUser;
        }
        else {
            System.out.println("Sorry "+ username + ", that was an invalid answer. Please try again.");
            return createUser();
        }
    }

    public static void main(String[] args) {
        CreateUserAccount newUser = new CreateUserAccount();
        newUser.createUser();
    }
}
