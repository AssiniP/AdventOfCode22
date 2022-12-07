package dayThreeTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dayThree.Rucksack;

class DayThreeTest {
	@Test
	void queSePuedaCrearUnRucksack() {
		Rucksack sack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		Assert.assertNotNull(sack);
	}
	
	@Test
	void queSePuedaSaberCualItemSeRepite() {
		Rucksack sack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		Character vo = sack.getRepeatedItem();
		Character ve = 'p';
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queSePuedaSaberElValorDelItemRepetido() {
		Rucksack sack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		Integer vo = sack.getValueOfRepeatedItem();
		Integer ve = 16;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queSePuedanSumarLosValoresDeLosItemsUsandoInput() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("test/dayThreeTest/sample.txt"));
		Integer valueOfItemsCombined = 0;
		while(scanner.hasNextLine()) {
			Rucksack sack = new Rucksack(scanner.nextLine());
			valueOfItemsCombined += sack.getValueOfRepeatedItem();
		}
		Integer ve = 157;
		Assert.assertEquals(ve, valueOfItemsCombined);
	}
	

}
