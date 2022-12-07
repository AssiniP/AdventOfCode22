package dayTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Tournament torneo = new Tournament();
		Player jugadoruno = new Player();
		Player jugadordos = new Player();
		torneo.addPlayer(jugadoruno);
		torneo.addPlayer(jugadordos);
		//la primera es del oponente
		Scanner scanner = new Scanner(new File("src/dayTwo/input.txt"));
		while(scanner.hasNextLine()) {
			String linea = scanner.nextLine();
			char ingresoUno = linea.charAt(0);
			char ingresoDos = linea.charAt(2);
			torneo.playRound(jugadoruno, jugadordos, ingresoUno, ingresoDos);
		}
		
		System.out.println(jugadordos.getScore());
		jugadordos.resetScore();
		jugadoruno.resetScore();
		
		scanner = new Scanner(new File("src/dayTwo/input.txt"));
		while(scanner.hasNextLine()) {
			String linea = scanner.nextLine();
			char ingresoUno = linea.charAt(0);
			char ingresoDos = linea.charAt(2);
			torneo.calculateRound(jugadoruno, jugadordos, ingresoUno, ingresoDos);
		}
		System.out.println(jugadordos.getScore());

	}

}
