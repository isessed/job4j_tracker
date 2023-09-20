package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Война и мир", 1500);
        Book second = new Book("Гарри Поттер и филосовский камень", 320);
        Book third = new Book("Триумфальная арка", 400);
        Book fourth = new Book("Clean code", 464);
        Book[] book = new Book[4];
        book[0] = first;
        book[1] = second;
        book[2] = third;
        book[3] = fourth;
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println(System.lineSeparator() + "Replace book 0 to 3");
        Book rsl = book[0];
        book[0] = book[3];
        book[3] = rsl;
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(System.lineSeparator() + "The output of books named \"Clean code\"." + System.lineSeparator() + bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
