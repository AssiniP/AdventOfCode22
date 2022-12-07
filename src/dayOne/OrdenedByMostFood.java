package dayOne;

import java.util.Collection;
import java.util.Comparator;

public class OrdenedByMostFood implements Comparator<Elve> {

	@Override
	public int compare(Elve o1, Elve o2) {
		// TODO Auto-generated method stub
		return o1.getTotalOfCaloriesInFood().compareTo(o2.getTotalOfCaloriesInFood());
	}

}
