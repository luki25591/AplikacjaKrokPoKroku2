package pl.javastart.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINE = 1000;

    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINE];
    private int bookNumber = 0;
    private int magazinesNumber = 0;

    public void addBook(Book book){
        if(bookNumber < MAX_BOOKS){
            books[bookNumber] = book;
            bookNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta.");
        }
    }

    public void printBooks(){
        if(bookNumber == 0){
            System.out.println("Brak książek w Bibliotece.");
        }
        for (int i = 0; i < bookNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazine(Magazine magazine){
        if(magazinesNumber < MAX_MAGAZINE){
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Maksymalna liczba magazynów została osiągnięta.");
        }
    }

    public void printMagazines(){
        if(magazinesNumber == 0){
            System.out.println("Brak magazynów w Bibliotece.");
        }
        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }

}

