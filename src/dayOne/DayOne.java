package dayOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;


public class DayOne {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("src/dayOne/input.txt"));
		Boat boat = new Boat();
		Integer calories = 0;
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Elve elve = new Elve();
			if(line.isBlank()) {
				elve.addFood(calories);
				boat.addElve(elve);
				calories = 0;
			} else {
				calories += (Integer.parseInt(line));
			}
		}
		System.out.println(boat.getTheElveCarryingMostFood().getTotalOfCaloriesInFood());
		System.out.println(boat.getTheTotalCaloriesOfTheTopThreeElves());
	}
}
