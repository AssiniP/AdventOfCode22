package dayOne;

import java.util.LinkedList;

public class Boat {
	private LinkedList<Elve> tripulation;
	
	public Boat() {
		tripulation = new LinkedList<>();
	}

	public void addElve(Elve elve) {
		// TODO Auto-generated method stub
		tripulation.add(elve);
	}

	public Integer getTripulation() {
		// TODO Auto-generated method stub
		return tripulation.size();
	}

	public Elve getTheElveCarryingMostFood() {
		// TODO Auto-generated method stub
		LinkedList<Elve> tripulationOrdenedByMostFood = new LinkedList<Elve>();
		tripulationOrdenedByMostFood.addAll(tripulation);
		tripulationOrdenedByMostFood.sort(new OrdenedByMostFood().reversed());
		return tripulationOrdenedByMostFood.getFirst();
	}

	public Integer getTheTotalCaloriesOfTheTopThreeElves() {
		// TODO Auto-generated method stub
		LinkedList<Elve> tripulationOrdenedByMostFood = new LinkedList<Elve>();
		tripulationOrdenedByMostFood.addAll(tripulation);
		tripulationOrdenedByMostFood.sort(new OrdenedByMostFood().reversed());
		Integer caloriesTotal = 0;
		for(int i = 0; i < 3 ; i++) {
			caloriesTotal += tripulationOrdenedByMostFood.get(i).getTotalOfCaloriesInFood();
		}
		return caloriesTotal;
	}

}
