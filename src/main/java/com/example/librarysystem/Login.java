package com.example.librarysystem;

import org.apache.juli.logging.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    List<List<String>> users = new ArrayList<>();
    CreateUserAccount createNewAccount = new CreateUserAccount();

    Scanner fileScanner = new Scanner(new File("registered_users.csv")); {
        while(scanner.hasNextLine()) {
            users.add(getUsersFromLine(scanner.nextLine()));
        }
    }
    public Login() throws FileNotFoundException{

    }

    public List<String> getUsersFromLine(String line) {
        List <String> values = new ArrayList<>();
        try(Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while(rowScanner.hasNext()){
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    public User login () {
        System.out.println("Please enter your user name");
        System.out.println(String.format(String.valueOf(users)));
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

    public static void main(String[] args) throws FileNotFoundException {
        Login login = new Login();
        System.out.println(login.login());
    }


    }

