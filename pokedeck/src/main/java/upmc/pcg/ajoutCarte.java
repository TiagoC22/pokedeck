
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;


import java.util.Scanner;
import upmc.pcg.game.EnergyCard;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import upmc.pcg.game.TrainerCard;
import upmc.pcg.game.TrainerType;

/**
 *
 * @author lepor
 */
public class ajoutCarte {
    private EnergyType energyType;
    private TrainerType trainerType;
    
    
    public void texte1() {
    
    Scanner t1 = new Scanner(System.in);
    System.out.println("Quel type de carte voulez-vous ajouté ?");
    System.out.println("[1] Pokemon");
    System.out.println("[2] Trainer");
    System.out.println("[3] Energy");
    System.out.println("[4] Revenir au menu");
    int choix = t1.nextInt();
  
    
    switch (choix) {
        
        case 1 : if (choix == 1) {
            PokemonCard.askPokemonCard(); //Appel de la méthode choix utilisateur PokemonCard
        }
        case 2 : if (choix == 2) {
            TrainerCard.askTrainerCard();
        }
        case 3 : if (choix == 3)  {
            EnergyCard.askEnergyCard();
        }
        
        case 4 : if (choix == 4 ) {
            Menu menu = new Menu(); //Lancement du menu
            menu.start();
        }
    }
}

}

    



