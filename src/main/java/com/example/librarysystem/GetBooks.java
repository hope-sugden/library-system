package com.example.librarysystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetBooks {
    List<List<String>> books = new ArrayList<>();
    Scanner scanner = new Scanner(new File("books_data.csv")); {
        while(scanner.hasNextLine()) {
            books.add(getBooksFromLine(scanner.nextLine()));
        }
    }

    public GetBooks() throws FileNotFoundException {
    }

    public List <String> getBooksFromLine(String line) {
        List <String> values = new ArrayList<>();
        try(Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while(rowScanner.hasNext()){
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
