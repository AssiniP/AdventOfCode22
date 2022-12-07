package dayOne;

import java.util.ArrayList;

public class Elve implements Comparable<Elve>{
	private Integer caloriesTotal;

	public Elve() {
		super();
		this.caloriesTotal = 0;
	}

	public void addFood(Integer caloriesInFood) {
		// TODO Auto-generated method stub
		this.caloriesTotal += caloriesInFood;
	}


	public Integer getTotalOfCaloriesInFood() {
		// TODO Auto-generated method stub
		return this.caloriesTotal;
	}

	@Override
	public int compareTo(Elve o) {
		// TODO Auto-generated method stub
		return this.getTotalOfCaloriesInFood().compareTo(o.getTotalOfCaloriesInFood());
	}
	

}
