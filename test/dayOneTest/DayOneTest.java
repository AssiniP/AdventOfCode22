package dayOneTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dayOne.Boat;
import dayOne.Elve;

class DayOneTest {

	@Test
	void queSePuedaCrearUnBoteConElfos() {
		Boat boat = new Boat();
		boat.addElve(new Elve());
		boat.addElve(new Elve());
		boat.addElve(new Elve());
		boat.addElve(new Elve());
		boat.addElve(new Elve());
		Integer vo = boat.getTripulation();
		Integer ve =  5;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queLosElfosPuedanLlevarComida() {
		Elve elve = new Elve();
		elve.addFood(1000);
		elve.addFood(2000);
		elve.addFood(3000);
		Integer vo = elve.getTotalOfCaloriesInFood();
		Integer ve = 6000;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	void queSePuedaVerCualEsElElfoConMasComidaYCuantasCaloriasTiene() {
		Boat boat = new Boat();
		Elve elveOne = new Elve();
		elveOne.addFood(1000);
		elveOne.addFood(2000);
		elveOne.addFood(3000);
		
		Elve elveTwo = new Elve();
		elveTwo.addFood(4000);
		
		Elve elveThree = new Elve();
		elveThree.addFood(5000);
		elveThree.addFood(6000);
		
		Elve elveFour = new Elve();
		elveFour.addFood(7000);
		elveFour.addFood(8000);
		elveFour.addFood(9000);
		
		Elve elveFive = new Elve();
		elveFive.addFood(10000);
		
		boat.addElve(elveOne);
		boat.addElve(elveTwo);
		boat.addElve(elveThree);
		boat.addElve(elveFour);
		boat.addElve(elveFive);
		
		Integer vo = boat.getTheElveCarryingMostFood().getTotalOfCaloriesInFood();
		Integer ve = 24000;
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaIngresarUnInputDeTextoAlCodigo() throws IOException {
		Boat boat = new Boat();		
		Scanner scanner = new Scanner(new File("test/dayOneTest/sample.txt"));
		Integer calories = 0;
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Elve elve = new Elve();
			if(line.isBlank()) {
				System.out.println("Espacio");
				elve.addFood(calories);
				boat.addElve(elve);
				calories = 0;
			} else {
				System.out.println(line);
				calories += (Integer.parseInt(line));
			}
		}
		
		Integer vo = boat.getTheElveCarryingMostFood().getTotalOfCaloriesInFood();
		Integer ve = 24000;
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaVerElTotalDeLosTresElfosConMasCalorias() {
		Boat boat = new Boat();
		Elve elveOne = new Elve();
		elveOne.addFood(1000);
		elveOne.addFood(2000);
		elveOne.addFood(3000);
		
		Elve elveTwo = new Elve();
		elveTwo.addFood(4000);
		
		Elve elveThree = new Elve();
		elveThree.addFood(5000);
		elveThree.addFood(6000);
		
		Elve elveFour = new Elve();
		elveFour.addFood(7000);
		elveFour.addFood(8000);
		elveFour.addFood(9000);
		
		Elve elveFive = new Elve();
		elveFive.addFood(10000);
		
		boat.addElve(elveOne);
		boat.addElve(elveTwo);
		boat.addElve(elveThree);
		boat.addElve(elveFour);
		boat.addElve(elveFive);
		
		Integer vo = boat.getTheTotalCaloriesOfTheTopThreeElves();
		Integer ve = 45000;
		Assert.assertEquals(ve, vo);
	}

}
