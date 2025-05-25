//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Author authorFirst= new Author("Иван", "Тургенев");
        Book bookFirst = new Book("Муму", authorFirst, 1852);
        System.out.println(bookFirst.getAuthor().getName());
        System.out.println(bookFirst.getAuthor().getSurname());
        System.out.println(bookFirst.getYear());

        Author authorSecond = new Author("Федор", "Достоевский");
        Book bookSecond = new Book("Игрок", authorSecond, 1865);
        System.out.println(bookSecond.getAuthor().getName());
        System.out.println(bookSecond.getAuthor().getSurname());
        System.out.println(bookSecond.getYear());
        bookSecond.setYear(1866);
        System.out.println(bookSecond.getYear());
    }
}