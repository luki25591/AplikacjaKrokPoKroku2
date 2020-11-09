package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close(){
        sc.close();
    }

    public Book readAndCerateBook(){
        System.out.println("Tytuł:");
        String title = sc.nextLine();
        System.out.println("Autor:");
        String authir = sc.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = sc.nextLine();
        System.out.println("ISBN:");
        String ISBN = sc.nextLine();
        System.out.println("Rok wydania:");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba stron:");
        int pages = sc.nextInt();
        sc.nextLine();
        return new Book(title, authir, releaseDate,pages, publisher, ISBN);
    }

    public int getInt(){
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
