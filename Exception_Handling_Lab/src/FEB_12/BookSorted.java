package FEB_12;

import java.util.TreeSet;



public class BookSorted {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
        
        System.out.println("Books sorted by name (Alphabetical): " + books);
    }
}
