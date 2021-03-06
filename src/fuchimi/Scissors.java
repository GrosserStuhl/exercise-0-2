package fuchimi;

public class Scissors extends Hand {

	public Scissors() {
		super();
	}

	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	protected Boolean loseAgainst(Paper paper) {
		return false;
	}

	protected Boolean loseAgainst(Rock rock) {
		return true;
	}

	@Override
	public String toString() {
		return "Scissors";
	}

}
