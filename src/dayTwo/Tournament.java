package dayTwo;

import java.util.ArrayList;

public class Tournament {
	
	private ArrayList<Player> playersInTournament;
	
	public Tournament() {
		super();
		this.playersInTournament = new ArrayList<Player>();
	}

	public void addPlayer(Player jugador) {
		// TODO Auto-generated method stub
		this.playersInTournament.add(jugador);
	}

	public void playRound(Player jugadoruno, Player jugadordos, char eleccionDelJugadorUno, char eleccionDelJugadorDos) {
		// TODO Auto-generated method stub
		//UNO ES OPONENTE, DOS INGRESO
		//desde la perspectiva de jug 1
		eleccionDelJugadorUno = changeTheInput(eleccionDelJugadorUno);
		eleccionDelJugadorDos = changeTheInput(eleccionDelJugadorDos);
		
		if(eleccionDelJugadorUno == eleccionDelJugadorDos) {
			outcomeIsADraw(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
		} else {
			switch(eleccionDelJugadorUno) {
			case 'X':
				if(eleccionDelJugadorDos == 'Z') {
					outcomeIsAWin(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				} else {
					outcomeIsALoss(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				}
				break;
			case 'Z':
				if(eleccionDelJugadorDos == 'X') {
					outcomeIsALoss(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				} else {
					outcomeIsAWin(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				}
				break;
			case 'Y':
				if(eleccionDelJugadorUno < eleccionDelJugadorDos) {
					outcomeIsALoss(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				} else {
					outcomeIsAWin(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
				}
			}
		}
	}

	private void outcomeIsAWin(Player jugadoruno, Player jugadordos, char eleccionDelJugadorUno,
			char eleccionDelJugadorDos) {
		// TODO Auto-generated method stub
		Integer playerOneScore = calculateValueOfChoice(eleccionDelJugadorUno);
		Integer playerTwoScore = calculateValueOfChoice(eleccionDelJugadorDos);
		jugadoruno.addToTheScore(playerOneScore + 6);
		jugadordos.addToTheScore(playerTwoScore + 0);
	}

	private Integer calculateValueOfChoice(char eleccionDelJugador) {
		// TODO Auto-generated method stub
		switch(eleccionDelJugador) {
		case 'X':
			return 1;
		case 'Y':
			return 2;
		case 'Z':
			return 3;
			}
		return null;
	}

	private void outcomeIsALoss(Player jugadoruno, Player jugadordos, char eleccionDelJugadorUno,
			char eleccionDelJugadorDos) {
		// TODO Auto-generated method stub
		Integer playerOneScore = calculateValueOfChoice(eleccionDelJugadorUno);
		Integer playerTwoScore = calculateValueOfChoice(eleccionDelJugadorDos);
		jugadoruno.addToTheScore(playerOneScore + 0);
		jugadordos.addToTheScore(playerTwoScore + 6);
		
	}

	private void outcomeIsADraw(Player jugadoruno, Player jugadordos, char eleccionDelJugadorUno,
			char eleccionDelJugadorDos) {
		// TODO Auto-generated method stub
		Integer playerOneScore = calculateValueOfChoice(eleccionDelJugadorUno);
		Integer playerTwoScore = calculateValueOfChoice(eleccionDelJugadorDos);
		jugadoruno.addToTheScore(playerOneScore + 3);
		jugadordos.addToTheScore(playerTwoScore + 3);
	}

	private char changeTheInput(char eleccionDelJugador) {
		// TODO Auto-generated method stub
		switch(eleccionDelJugador) {
			case 'A':
				return 'X';
			case 'B':
				return 'Y';
			case 'C':
				return 'Z';
			default:
				return eleccionDelJugador;
				}
	}

	public void calculateRound(Player jugadoruno, Player jugadordos, char eleccionDelJugadorUno, char rondaDecidida) {
		// TODO Auto-generated method stub
		char eleccionDelJugadorDos = 'a';
		switch(rondaDecidida) {
		case 'Y':
			eleccionDelJugadorDos = eleccionDelJugadorUno;
			break;
		case 'X':
			if(eleccionDelJugadorUno == 'A') {
			eleccionDelJugadorDos = 'Z';
			} else if (eleccionDelJugadorUno == 'B'){
				eleccionDelJugadorDos = 'X';
			} else {
				eleccionDelJugadorDos = 'Y';
			}
			break;
		case 'Z':
			if(eleccionDelJugadorUno == 'A') {
				eleccionDelJugadorDos = 'Y';
				} else if(eleccionDelJugadorUno == 'B'){
					eleccionDelJugadorDos = 'Z';
				} else {
					eleccionDelJugadorDos = 'X';
				}
			break;
		}
		playRound(jugadoruno, jugadordos, eleccionDelJugadorUno, eleccionDelJugadorDos);
	}

}
