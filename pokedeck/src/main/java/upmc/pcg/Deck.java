/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import java.util.Scanner;
import static upmc.pcg.game.EnergyCard.getArrayEnergy;
import static upmc.pcg.game.PokemonCard.getArrayPokemon;
import static upmc.pcg.game.TrainerCard.getArrayTrainer;


/**
 *
 * @author lepor
 */
public class Deck {



    public static void displayCard(){
        
        Scanner console1 = new Scanner(System.in);
        System.out.println("Which card deck do you want to watch : ");
        System.out.println("[1] Pokemon deck");
        System.out.println("[2] Trainer deck");
        System.out.println("[3] Energy deck");
        System.out.flush();
        int choicedeck = console1.nextInt();
        
        switch(choicedeck) {
            case 1 : if (choicedeck == 1) {
                System.out.println(getArrayPokemon().toString());
            }
                
            case 2 : if (choicedeck == 2 ) {
                System.out.println(getArrayTrainer().toString());
            }
                
            case 3 : if (choicedeck == 3 ) {
                System.out.println(getArrayEnergy().toString());
            }
        }
        
    }
    


 
}
