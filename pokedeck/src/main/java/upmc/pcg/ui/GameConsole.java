package upmc.pcg.ui;



import java.util.Scanner;
import upmc.pcg.Card;
import upmc.pcg.Deck;
import upmc.pcg.game.EnergyCard;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import upmc.pcg.game.TrainerCard;
import upmc.pcg.game.TrainerType;


public class GameConsole {

	Scanner scanner = new Scanner(System.in);
	private String choice;
	private int value;

	public GameConsole(Scanner scanner) {
		this.scanner = scanner;
	}

	

	public void allDeck(Deck game) {
		if (game.sizeDeck() == 0) {
			System.out.println("Le paquet est vide");
		} else {
			game.seeDeck();
		}
	}


	public int choiceTypeOfCard() {
		System.out.println("1 / Pokemon");
                System.out.println("2 / Trainer");
                System.out.println("3 / Energy");
		choice = scanner.nextLine();
		int value = Integer.parseInt(choice);
		return value;
	}

	public Card displayCard(Deck game, int value) {
		
		switch (value) {
                case 1: //Case pokemon
                    int id;
			
			
			
                        // Choix de l'Energie
			System.out.println("Energy of pokemon :");
			int i = 0;
			for (EnergyType type : EnergyType.values()) {
				System.out.println(i + " - " + type);
				i++;
			}

			
			choice = scanner.nextLine();
			value = Integer.parseInt(choice);
			EnergyType energy = EnergyType.values()[value];

			// Choix du nom du Pokemon
			System.out.println("Name of pokemon :");
			String namePokemon = scanner.nextLine();

			
			
}
