package state;

import model.Book;

public abstract class State {

    public abstract void takeBack(Book book);

    public abstract void request(Book book);

}
