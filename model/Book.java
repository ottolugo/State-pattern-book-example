package model;

import state.AvailableState;
import state.State;

public class Book {

    private final String _title;
    private State _state;

    public Book(String title) {
	_title = title;
	_state = new AvailableState();
    }

    public String getTitle() {
	return _title;
    }

    // This method have package visibility -> State and Book need to be in the
    // same package
    public void changeState(State state) {
	_state = state;
    }

    @Override
    public String toString() {
	return _title;
    }

    public void takeBack() {
	_state.takeBack(this);
    }

    public void request() {
	_state.request(this);
    }

}
