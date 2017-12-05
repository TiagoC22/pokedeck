
package upmc.pcg;


import java.util.Scanner;
import upmc.pcg.game.EnergyCard;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import upmc.pcg.game.TrainerCard;
import upmc.pcg.game.TrainerType;

public class addCard {
    private EnergyType energyType;
    private TrainerType trainerType;
    
    
public void askAddCard() {
    
    Scanner t1 = new Scanner(System.in);
    System.out.println("What kind of card do you want added ?");
    System.out.println("[1] Pokemon");
    System.out.println("[2] Trainer");
    System.out.println("[3] Energy");
    System.out.println("[4] Back to the menu");
    int choice = t1.nextInt();
  
    
    switch (choice) {
        
        case 1 : if (choice == 1) {
            PokemonCard.askPokemonCard(); //call method askPokemonCard for user create card Pokemon
        }
        case 2 : if (choice == 2) {
            TrainerCard.askTrainerCard();
        }
        case 3 : if (choice == 3)  {
            EnergyCard.askEnergyCard();
        }
        
        case 4 : if (choice == 4 ) {
            Menu menu = new Menu(); //run the menu
            menu.start();
        }
    }
    public void ajouterCarte(Card card) {
		deck.add(card);
	}
	
}

}

    



