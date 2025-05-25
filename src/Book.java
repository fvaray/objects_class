import java.util.Objects;

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

    public String getName() { return name;}

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.getName() + " " + this.author.getName() + " " + this.author.getSurname() + " " + this.getYear();
    }

    public boolean equals(Book otherObject) {
        if (this.author.equals(otherObject.author)) {
            if (this.name.equals(otherObject.name)) return true;
            else return false;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }
}
