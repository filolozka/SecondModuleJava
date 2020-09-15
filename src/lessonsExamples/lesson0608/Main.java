package lessonsExamples.lesson0608;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("WarAndPeace", "Tolstoy", 1999);
        Book b2 = new Book("Peace", "Tolstoy", 2000);
        Book b3 = new Book("Karenina", "Tolstoy", 1970);
        Book b4 = new Book("Bolshoy", "Belyanin", 2011);
        Book b5 = new Book("PosleBala", "Tolstoy", 2020);

        Book[] books = new Book[]{b1, b2, b3, b4, b5};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
