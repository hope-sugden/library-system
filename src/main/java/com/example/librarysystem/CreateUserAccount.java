package com.example.librarysystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
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
            saveUser(newAdmin);
            return newAdmin;
        } else if (answer.toLowerCase().equals("n")) {
            User newUser = new User(username,false);
            LibrarySystemApplication.registeredUsers.add(newUser);
            System.out.println("Hi "+ username + ", thanks for creating an account. Welcome to the library.");
            saveUser(newUser);
            return newUser;
        }
        else {
            System.out.println("Sorry "+ username + ", that was an invalid answer. Please try again.");
            return createUser();
        }
    }
    public void saveUser(User user) {

        try {
            FileWriter pw = new FileWriter("registered_users.csv",true);
            if(user==null){
                System.out.println("Empty");
            }
            pw.append(user.getName());
            pw.append(",");
            pw.append(String.valueOf(user.getAdmin()));
            pw.append("\n");
            pw.flush();
            pw.close();
        } catch (Exception e){
            System.out.println(e + "exception caught.");
        }
    }


}
