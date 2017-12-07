/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upmc.pcg;
import upmc.pcg.ui.GameConsole;
import java.util.Scanner;

/**
 *
 * @author Tiago
 */

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public GameConsole GameConsole;
    private Deck game;

    public Menu(Scanner scanner, Deck jeu) {
        this.scanner = scanner;
        GameConsole = new GameConsole(scanner);
        game = jeu;
    }
	
    String choice = "1";
    public void start() {
    
        System.out.println("Veuillez faire un choix :");
	while (Integer.parseInt(choice) != 0) {
            askUser(); //Call method askUser
	}
    }

    public void askUser() {

    System.out.println("1 / Add a card");
    System.out.println("2 / Delete a card");
    System.out.println("3 / Update a card");
    System.out.println("4 / See the deck");
    System.out.println("5 / Search a card");
    System.out.println("6 / Leave");

    choice = scanner.nextLine();
        if (choice.equals("")) {
            choice = "0";
            System.out.println("Choose an existing choice");
        }

        int value = Integer.parseInt(choice);

        switch(value) {
            default : System.out.println("This is not a good choice !"); break;
                case 1 : //Add a card
                GameConsole.addCardDeck(game);
                    break;
                                
                case 2 : //Delete a card
                GameConsole.delCardDeck(game);
                    break;
                        
                case 3 : //Update a card
                GameConsole.updateCardDeck(game);
                    break;
                            
                case 4 : //See deck
		GameConsole.allDeck(game);
                    break;
			
                case 5 : //Search a card
		GameConsole.searchCard(game);
                    break;
			
                case 6 :
		System.exit(0);
                    break;
	}
    }	
}
