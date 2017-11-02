/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import static upmc.pcg.game.PokemonCard.getCarte;

import static upmc.pcg.game.PokemonCard.deck;
//import static upmc.pcg.game.PokemonCard.jeu1;
//import static upmc.pcg.game.PokemonCard.jeu2;
//import static upmc.pcg.game.PokemonCard.jeu3;
/**
 *
 * @author lepor
 */
public class Paquet {



    public static void afficherCarte(){
        System.out.println(getNameCard()+" | "+getHpCard()+" | "+getEnergyCard());
        
    
    }

    private static String getNameCard() {
       return deck.get(0);
    }
    
    private static int getHpCard() {
       return deck.get(0);
    }
    
    private static EnergyType getEnergyCard() {
       return deck.get(0);
    }

 
}
