package dayThreeTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dayThree.ElveGroup;
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
	
	@Test
	void queSePuedanVerLaInsigniaDeCadaGrupo(){
		ElveGroup group = new ElveGroup();
		Rucksack sackOne = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		Rucksack sackTwo = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
		Rucksack sackThree = new Rucksack("PmmdzqPrVvPwwTWBwg");
		group.addRucksack(sackOne);
		group.addRucksack(sackTwo);
		group.addRucksack(sackThree);
		Character vo = group.getBadge();
		Character ve = 'r';
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queSePuedanVerElValorDeLaInsignia(){
		ElveGroup group = new ElveGroup();
		Rucksack sackOne = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
		Rucksack sackTwo = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
		Rucksack sackThree = new Rucksack("PmmdzqPrVvPwwTWBwg");
		group.addRucksack(sackOne);
		group.addRucksack(sackTwo);
		group.addRucksack(sackThree);
		Integer vo = group.getValueOfBadge();
		Integer ve = 18;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queSePuedanSumarLasInsigniasUsandoInput() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("test/dayThreeTest/sample.txt"));
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
		Integer ve = 70;
		Assert.assertEquals(ve, valueOfBadges);
	}
	

}
