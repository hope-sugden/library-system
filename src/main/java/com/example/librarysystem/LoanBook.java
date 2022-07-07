package com.example.librarysystem;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoanBook {
    Scanner scanner = new Scanner(System.in);
    public List<String> loanedBooks = new ArrayList<>();
    public void loanBook() throws FileNotFoundException {
        GetBooks getBooks = new GetBooks();
        for (List<String> book: getBooks.books){
            System.out.println(book.toString().replace("[","").replace("]","").replace("\"","").concat("\t\t").trim());};
        String value = scanner.nextLine();
        loanedBooks.add(String.valueOf(getBooks.books.get(Integer.parseInt(value))));
        getBooks.books.remove(getBooks.books.get(Integer.parseInt(value)));
    }
}
