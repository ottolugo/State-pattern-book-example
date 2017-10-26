package main;

import model.Book;

public class Test {

    public static void main(String[] args) {
	Book book1 = new Book("Test book");
	Book book2 = new Book("Test book 2");
	book1.takeBack();
	book2.request();
	book1.request();
	book2.request();
	book1.request();
	book2.takeBack();
	book1.takeBack();
	book2.takeBack();
    }

}
