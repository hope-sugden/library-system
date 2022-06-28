package com.example.librarysystem;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MenuController {

    Scanner scanner = new Scanner(System.in);

    public void userControlMenu(String name) throws FileNotFoundException {

       String menuControl = scanner.nextLine();

        switch (menuControl) {
            case "1": GetBooks getBooks = new GetBooks();
                for (List<String> book: getBooks.books){
                    System.out.println(book.toString().replace("[","").replace("]","").replace("\"","").concat("\t\t").trim());};
                break;
            case "2": ;
            break;
            case "3": ;
            break;
            case "4": new Welcome().welcome();
            break;
            case "5": System.out.println("Thanks " + name + " for visiting the library. See you next time!");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                userControlMenu(name);
                break;
        }
    }

    public void adminControlMenu(String name) throws FileNotFoundException {

        String menuControl = scanner.nextLine();

        switch (menuControl) {
            case "1": GetBooks getBooks = new GetBooks();
            for (List<String> book: getBooks.books){
                System.out.println(book);};
//            case "1": GetBooks getBooks = new GetBooks();
//                for (int i=1; i>getBooks.books.size();i++){
//                    System.out.println(getBooks.books.get(i).get(0) + "\t\tTitle: "+ getBooks.books.get(i).get(1) + ", By "+ getBooks.books.get(i).get(2));
//                }
                break;
            case "2": ;
                break;
            case "3": ;
                break;
            case "4": new Welcome().welcome();
                break;
            case "5":
                System.out.println("Thanks " + name + " for visiting the library. See you next time!");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                userControlMenu(name);
                break;
        }
    }
}
