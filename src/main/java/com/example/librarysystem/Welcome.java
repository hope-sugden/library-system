package com.example.librarysystem;

import java.util.Scanner;

public class Welcome {

    Scanner scanner = new Scanner(System.in);

    public String welcome() {
        System.out.println("Welcome to the library. Please login or create an account.");
        System.out.println(" 1\t\tlogin");
        System.out.println(" 2\t\tcreate an account");
        String answer = scanner.nextLine();
        String name = null;
        if(answer.equals("1")){
            Login login = new Login();
            name = login.login();
        }
        else if(answer.equals("2")){
            CreateUserAccount createUserAccount = new CreateUserAccount();
            name = createUserAccount.createUser();
        }else {
            System.out.println("Invalid choice, please try again.");
            welcome();
        }
        return name;
    }
}
