package dayTwo;

public class Player {
	
	private Integer score;
	
	public Player() {
		super();
		this.score = 0;
	}

	public Integer getScore() {
		// TODO Auto-generated method stub
		return score;
	}

	public void addToTheScore(int i) {
		// TODO Auto-generated method stub
		this.score += i;
	}

	public void resetScore() {
		// TODO Auto-generated method stub
		this.score = 0;
	}

}
