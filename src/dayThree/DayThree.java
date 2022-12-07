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

	}

}
