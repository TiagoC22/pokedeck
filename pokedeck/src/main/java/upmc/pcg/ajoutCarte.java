/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import java.util.Scanner;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;

/**
 *
 * @author lepor
 */
public class ajoutCarte {
    private EnergyType energyType;
    private String nomPokemon;
    private String energyPokemon;
    private int hpPokemon;
    
    public void texte1() {
    
    Scanner t1 = new Scanner(System.in);
    System.out.println("Quel type de carte voulez-vous ajouté ?");
    System.out.println("[1] Pokemon");
    System.out.println("[2] Trainer");
    System.out.println("[3] Energy");
    int choix = t1.nextInt();
  
    
    switch (choix) {
        case 1 : if (choix == 1) {
             Scanner pok = new Scanner(System.in);
    System.out.println("Nom : ");
    System.out.flush();
    nomPokemon = pok.nextLine();
    
    System.out.println("HP : ");
    System.out.flush();
    hpPokemon = pok.nextInt();
    
    
        PokemonCard pokemon = new PokemonCard(nomPokemon, hpPokemon, energyType);
        System.out.print(pokemon);
    }
        
        
    }
    }
}
