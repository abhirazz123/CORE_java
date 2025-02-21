package FEB_12;

public record Book(String name, String author) implements Comparable<Book> {
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }
}