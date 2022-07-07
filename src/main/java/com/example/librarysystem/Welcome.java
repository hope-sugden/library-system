package com.example.librarysystem;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Welcome {

    Scanner scanner = new Scanner(System.in);

    public User welcome() throws FileNotFoundException {
        System.out.println("Welcome to the library. Please login or create an account.");
        System.out.println(" 1\t\tlogin");
        System.out.println(" 2\t\tcreate an account");
        String answer = scanner.nextLine();
        User user = null;
        String name = null;
        if(answer.equals("1")){
            Login login = new Login();
            user = login.login();
            name = user.getName();

        }
        else if(answer.equals("2")){
            CreateUserAccount createUserAccount = new CreateUserAccount();
            user = createUserAccount.createUser();
            name = user.getName();

        }else {
            System.out.println("Invalid choice, please try again.");
            welcome();
        }
        return user;
    }
}
