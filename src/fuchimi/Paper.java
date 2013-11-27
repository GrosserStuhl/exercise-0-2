package fuchimi;

public class Paper extends Hand {

	public Paper() {
		super();
	}

	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	protected Boolean loseAgainst(Scissors scissors) {
		return true;
	}

	protected Boolean loseAgainst(Rock rock) {
		return false;
	}

	@Override
	public String toString() {
		return "Paper";
	}

}
