package dayThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayThree {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("src/dayThree/input.txt"));
		Integer valueOfItemsCombined = 0;
		while(scanner.hasNextLine()) {
			Rucksack sack = new Rucksack(scanner.nextLine());
			valueOfItemsCombined += sack.getValueOfRepeatedItem();
		}
		System.out.println(valueOfItemsCombined);
		scanner = new Scanner(new File("src/dayThree/input.txt"));
		Integer valueOfBadges = 0;
		while(scanner.hasNextLine()) {
			Rucksack one = new Rucksack(scanner.nextLine());
			Rucksack two = new Rucksack(scanner.nextLine());
			Rucksack three = new Rucksack(scanner.nextLine());
			ElveGroup group = new ElveGroup();
			group.addRucksack(one);
			group.addRucksack(two);
			group.addRucksack(three);
			valueOfBadges += group.getValueOfBadge();
		}
		System.out.println(valueOfBadges);

	}

}
