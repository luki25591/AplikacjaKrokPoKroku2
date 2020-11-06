package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCerateBook();
        books[1] = dataReader.readAndCerateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek.");
    }
}
