/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import static upmc.pcg.game.PokemonCard.getCarte;
import static upmc.pcg.game.PokemonCard.jeu;


/**
 *
 * @author lepor
 */
public class Paquet {



    public static void afficherCarte(){
        System.out.println(getNameCard()+" | "+getHpCard()+" | "+getEnergyCard());
        
    
    }

    private static PokemonCard getNameCard() {
       return jeu.get(0);
    }
    
    private static PokemonCard getHpCard() {
       return jeu.get(0);
    }
    
    private static PokemonCard getEnergyCard() {
       return jeu.get(0);
    }

 
}
