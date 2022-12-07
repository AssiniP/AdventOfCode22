package dayTwoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dayTwo.Player;
import dayTwo.Tournament;

class DayTwoTest {
	
	@Test
	void queSePuedaCrearUnJugadorConCeroComoSuScoreInicial() {
		Player nuevo = new Player();
		Integer vo = nuevo.getScore();
		Integer ve = 0;
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaCrearUnTorneo() {
		Tournament torneo = new Tournament();
		Assert.assertNotNull(torneo);
	}
	
	@Test
	void queSePuedaIniciarUnJuegoEnElTorneo() {
		Tournament torneo = new Tournament();
		Player jugadoruno = new Player();
		Player jugadordos = new Player();
		torneo.addPlayer(jugadoruno);
		torneo.addPlayer(jugadordos);
		char eleccionDelJugadorUno = 'A';
		char eleccionDelJugadorDos = 'Y';
		//la primera es del oponente
		torneo.playRound(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
		Integer vo = jugadordos.getScore();
		Integer ve = 8;
		
		Integer vo2 = jugadoruno.getScore();
		Integer ve2 = 1;
		
		Assert.assertEquals(ve2, vo2);
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaCalcularElScoreDespuesDeVariosJuegos() {
		Tournament torneo = new Tournament();
		Player jugadoruno = new Player();
		Player jugadordos = new Player();
		torneo.addPlayer(jugadoruno);
		torneo.addPlayer(jugadordos);
		//la primera es del oponente
		torneo.playRound(jugadoruno, jugadordos, 'A', 'Y');
		torneo.playRound(jugadoruno, jugadordos, 'B', 'X');
		torneo.playRound(jugadoruno, jugadordos, 'C', 'Z');
		
		Integer vo = jugadordos.getScore();
		Integer ve = 15;
		
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaIngresarDatosAlTorneo() throws FileNotFoundException {
		Tournament torneo = new Tournament();
		Player jugadoruno = new Player();
		Player jugadordos = new Player();
		torneo.addPlayer(jugadoruno);
		torneo.addPlayer(jugadordos);
		//la primera es del oponente
		Scanner scanner = new Scanner(new File("test/dayTwoTest/sample.txt"));
		while(scanner.hasNextLine()) {
			String linea = scanner.nextLine();
			char ingresoUno = linea.charAt(0);
			char ingresoDos = linea.charAt(2);
			torneo.playRound(jugadoruno, jugadordos, ingresoUno, ingresoDos);
		}
		Integer vo = jugadordos.getScore();
		Integer ve = 15;
		
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSePuedaCalcularQueSeNecesitaParaTerminarLaRonda() {
		Tournament torneo = new Tournament();
		Player jugadoruno = new Player();
		Player jugadordos = new Player();
		torneo.addPlayer(jugadoruno);
		torneo.addPlayer(jugadordos);
		//la primera es del oponente
		torneo.calculateRound(jugadoruno, jugadordos, 'A', 'Y');
		torneo.calculateRound(jugadoruno, jugadordos, 'B', 'X');
		torneo.calculateRound(jugadoruno, jugadordos, 'C', 'Z');
		
		Integer vo = jugadordos.getScore();
		Integer ve = 12;
		
		Assert.assertEquals(ve, vo);
	}

}
