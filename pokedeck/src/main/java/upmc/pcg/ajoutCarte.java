/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import java.util.Scanner;
import upmc.pcg.game.PokemonCard;

/**
 *
 * @author lepor
 */
public class ajoutCarte {
    
    public void texte1() {
    
    Scanner t1 = new Scanner(System.in);
    System.out.println("Quel type de carte voulez-vous ajouté ?");
    System.out.println("[1] Pokemon");
    System.out.println("[2] Trainer");
    System.out.println("[3] Energy");
    int choix = t1.nextInt();
        
    
    switch (choix) {
        case 1 : if (choix == 1) {
            PokemonCard pokemon = new PokemonCard(); //Lance la classe supprCarte
            pokemon.texte2(); //Lancement méthode
        }
    }
        System.out.println("Veuillez renseigner les champs suivants :");
        
    }
}
