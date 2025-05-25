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

        // методы объектов
        // toString для калссов Author и Book
        System.out.println(bookFirst.toString());
        System.out.println(authorSecond.toString());
        // equals
        Author authorThird = authorFirst;
        if(authorFirst.equals(authorThird))
            System.out.println("Автор один и тот же");
        else
            System.out.println("Авторы разные");
        Book bookThird = new Book("Муму", authorFirst, 1852);
        bookThird.setName("Отцы и дети");
        if(bookFirst.equals(bookThird))
            System.out.println("Книга одна и та же");
        else
            System.out.println("Книги разные");
        // hashCode
        System.out.printf("hashCode автора '%s' = %d \n", authorFirst.toString(), authorFirst.hashCode());
        System.out.printf("hashCode автора '%s' = %d \n", authorSecond.toString(), authorSecond.hashCode());
        System.out.printf("hashCode автора '%s' = %d s\n", authorThird.toString(), authorThird.hashCode());
        System.out.println();

        System.out.printf("hashCode книги '%s' = %d \n",bookFirst.toString(), bookFirst.hashCode());
        System.out.printf("hashCode книги '%s' = %d \n",bookSecond.toString(), bookSecond.hashCode());
        System.out.printf("hashCode книги '%s' = %d \n",bookThird.toString(), bookThird.hashCode());
    }

}