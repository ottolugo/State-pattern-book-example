package state;

import model.Book;

public class TakenState extends State {

    @Override
    public void takeBack(Book book) {
	System.out.println("Book " + book.getTitle() + " is now available");
	book.changeState(new AvailableState());
    }

    @Override
    public void request(Book book) {
	System.out.println("Book " + book.getTitle() + " is already taken");
    }

}
