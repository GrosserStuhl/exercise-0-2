package fuchimi;

public class Rock extends Hand {

	public Rock() {
		super();
	}

	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	protected Boolean loseAgainst(Scissors scissors) {
		return false;
	}

	protected Boolean loseAgainst(Paper paper) {
		return true;
	}

	@Override
	public String toString() {
		return "Rock";
	}

}
