package state;

import model.Book;

public class AvailableState extends State {

    @Override
    public void takeBack(Book book) {
	System.out.println("We already have the book titled " + book.getTitle());
    }

    @Override
    public void request(Book book) {
	System.out.println("Book " + book.getTitle() + " requested");
	book.changeState(new TakenState());
    }

}
