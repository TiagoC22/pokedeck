/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.ui;

/**
 *
 * @author Tiago
 */

import upmc.pcg.Card;
import java.util.Scanner;
import upmc.pcg.Card;
import upmc.pcg.Deck;
import upmc.pcg.game.EnergyCard;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import upmc.pcg.game.TrainerCard;
import upmc.pcg.game.TrainerType;


public class GameConsole {

    Scanner scanner =  new Scanner(System.in);
    
    public GameConsole(Scanner scanner) {
	this.scanner = scanner;
    }

    private String choice;
    public int choixAjoutTypeCarte() {
        System.out.println("1 / Pokemon");
        System.out.println("2 / Trainer");
        System.out.println("3 / Energy");
	choice = scanner.nextLine();
            int value = Integer.parseInt(choice);
            return value;
    }

    public Card retourneCarteCreee(Deck game, int value) {
    int idenergy;
    int id;
	
    switch (value) {
        case 1: EnergyType energie;
        
        // Id of the card
	do {
            System.out.println("Id of the card :");
            choice = scanner.nextLine();
            id = Integer.parseInt(choice);

            if (game.verifyDeck(id))
            System.out.println("The card already exist");

	}   while (game.verifyDeck(id));
                        
        // Type of energy
        System.out.println("Type of the pokemon :");
        idenergy = 0;
            for (EnergyType type : EnergyType.values()) {
		System.out.println(idenergy+" / "+type);
		idenergy++;
            }

        
	choice = scanner.nextLine();
	value = Integer.parseInt(choice);
	energie = EnergyType.values()[value];

        // Name of Pokemon
	System.out.println("Name of the pokemon :");
	String nomPokemon = scanner.nextLine();

        // Hp of Pokemon
	System.out.println("Hp of the pokemon :");
	choice = scanner.nextLine();
	int hp = Integer.parseInt(choice);

        //Create card Pokemon 
        return new PokemonCard(id, energie, nomPokemon, hp); 
		
        case 2: TrainerType trainerType;
        
        // Id of the card
        do {
            System.out.println("Id of the card :");
            choice = scanner.nextLine();
            id = Integer.parseInt(choice);

            if (game.verifyDeck(id)) {
                System.out.println("The card already exist");
            }

	}   while (game.verifyDeck(id));
            
        // Type of trainer
        System.out.println("Type of the trainer :");
	idenergy = 0;
            for (TrainerType type : TrainerType.values()) {
		System.out.println(idenergy + " - " + type);
		idenergy++;
	}

	
	choice = scanner.nextLine();
	value = Integer.parseInt(choice);
	trainerType = TrainerType.values()[value];

	// Name of the trainer
	System.out.println("Name of the trainer :");
	String nameTrainer = scanner.nextLine();
                        
        // Description of the trainer
	System.out.println("Description of the trainer :");
	String descriptionTrainer = scanner.nextLine();

        //Create trainer card
        return new TrainerCard(id, nameTrainer, descriptionTrainer, trainerType);

	case 3: EnergyType energyenergy;
        
        // Id of the card
        do {
            System.out.println("Id of the card :");
            choice = scanner.nextLine();
            id = Integer.parseInt(choice);

                if (game.verifyDeck(id))
                    System.out.println("The card already exist");
                                        
	}   while (game.verifyDeck(id));
        
        // Type of energy
        System.out.println("Type of energy :");
	idenergy = 0;
            for (EnergyType type : EnergyType.values()) {
		if (idenergy != 10) {
		System.out.println(idenergy + " - " + type);
		idenergy++;
                }
            }

        choice = scanner.nextLine();
        value = Integer.parseInt(choice);
        energyenergy = EnergyType.values()[value];

        // Name of the energy
        System.out.println("Name of the energy :");
        String nameEnergy = scanner.nextLine();
        
        //Create the energyCard
        return new EnergyCard(id, nameEnergy, energyenergy);

	default:
            System.out.println("Bad choice");
            return null;
    }
}

    public void addCardDeck(Deck game) {
	int value = choixAjoutTypeCarte();
	Card card = retourneCarteCreee(game, value);
	game.addCard(card);
    }

    public void delCardDeck(Deck game) {

	System.out.println("Write the id of the delete card");
	choice = scanner.nextLine();
	int id = Integer.parseInt(choice);

        if (!game.verifyDeck(id)) {
            System.out.println("Bad id");
	}   else {
		if (game.delCard(id))
                    System.out.println("Success");
		else
                    System.out.println("Error");
            }
    }

    public void updateCardDeck(Deck game) {
	System.out.println("Id of the card you want to update");
	choice = scanner.nextLine();
	int id = Integer.parseInt(choice);

        if (!game.verifyDeck(id)) {
            System.out.println("Write an existing id");
	}   else {
		System.out.println("New description :");
		String description = scanner.nextLine();
		game.addDescriptionCard(id, description);
            }
    }

    public int searchCardBy() {
	System.out.println("Search card by :");
        System.out.println("1 / Id of the card");
	System.out.println("2 / Name of the card");
	choice = scanner.nextLine();
	int value = Integer.parseInt(choice);

	return value;
    }

    public void resultSearchCard(Deck game, int value) {
	switch (value) {
        case 1:
            System.out.println(searchCardId(game).cardToString());
            break;

        case 2:
            System.out.println("Search card by");
            System.out.println("1 / By type");
            System.out.println("2 / By name");
            choice = scanner.nextLine();
            int num = Integer.parseInt(choice);

    switch (num) {
	case 1:
            System.out.println("This is a :");
            System.out.println("1 / Pokemon");
            System.out.println("2 / Trainer");
            System.out.println("3 / Energy");
            choice = scanner.nextLine();

                if (choice.equals("")) {
                    choice = "1";
		}

            int id = Integer.parseInt(choice);

            String name = "Pokemon";
                if (id == 2)
                    name = "Trainer";
                if (id == 3)
                    name = "Energy";

                game.displayCardType(name);
                break;

            case 2:
                
            name = scanner.nextLine();
            game.displayCardName(name);
            break;
	
            default:
            System.out.println("Error");
            break;
    }

            default:
		System.out.println("Error");
	}
    }

    public Card searchCardId(Deck game) {

        int id;
        do {
            System.out.println("Id of the card :");
            choice = scanner.nextLine();
            id = Integer.parseInt(choice);

                if (!game.verifyDeck(id))
                    System.out.println("The card not exist");
            }   while (!game.verifyDeck(id));
        return game.cardToDeck(id);
    }

    public void allDeck(Deck game) {
        if (game.sizeDeck() == 0) {
            System.out.println("Empty deck");
        }   else {
                game.seeDeck();
            }
    }

    public void searchCard(Deck game) {
        int value = searchCardBy();
        resultSearchCard(game, value);
    }
}
