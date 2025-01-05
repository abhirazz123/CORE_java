package NOV_11;


class Director {
    private String name;
    private int birthYear;

    public Director(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void displayDetails() {
        System.out.println("Director Name: " + name + ", Birth Year: " + birthYear);
    }
}

class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private Director director;

    public Movie(String title, String genre, int releaseYear, Director director) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public void displayDetails() {
        System.out.println("Movie Title: " + title + ", Genre: " + genre + ", Release Year: " + releaseYear);
        director.displayDetails();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Director director1 = new Director("Christopher Nolan", 1970);
        Movie movie1 = new Movie("Inception", "Sci-Fi", 2010, director1);

        Director director2 = new Director("Steven Spielberg", 1946);
        Movie movie2 = new Movie("Jurassic Park", "Action", 1993, director2);

        movie1.displayDetails();
        System.out.println();
        movie2.displayDetails();
    }
}
