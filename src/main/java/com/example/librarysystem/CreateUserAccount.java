package com.example.librarysystem;

import java.util.Scanner;

public class CreateUserAccount {
    Scanner scanner = new Scanner(System.in);
    LibrarySystemApplication libraryVisit = new LibrarySystemApplication();
    public String createUser() {
        System.out.println("Please enter a username");
        String username = scanner.nextLine();
        System.out.println("Are you admin? y/n");
        String answer = scanner.nextLine();
        if(answer.toLowerCase().equals("y")){
            libraryVisit.setAdmin(true);
            System.out.println("Hi "+ username + ", thanks for creating an admin account. Welcome to the library.");
            return username;
        } else if (answer.toLowerCase().equals("n")) {
            libraryVisit.setAdmin(false);
            System.out.println("Hi "+ username + ", thanks for creating an account. Welcome to the library.");
            return username;
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
