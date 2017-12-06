package upmc.pcg.ui;



import java.util.Scanner;

import upmc.pcg.Deck;



public class GameConsole {

	Scanner scanner = new Scanner(System.in);
	private String choice;
	private int value;

	public GameConsole(Scanner sc) {
		this.scanner = sc;
	}

	

	public void allDeck(Deck game) {
		if (game.sizeDeck() == 0) {
			System.out.println("Le paquet est vide");
		} else {
			game.seeDeck();
		}
	}

	

	public int choiceTypeOfCard() {
		System.out.println("Vous voulez ajouter une carte... ?");
		System.out.println("1 / Pokemon");
                System.out.println("2 / Dresseur");
                System.out.println("3 / Energie");
                
		choice = scanner.nextLine();
		int value = Integer.parseInt(choice);
		return value;
	}

	

}
