public class Book {

    private Author author;
    private String name;
    private int year;

    public Book(String name,Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
