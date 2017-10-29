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
            Scanner console1 = new Scanner(System.in);
            System.out.println("Nom : ");
            System.out.flush();
            String nomPokemon = console1.nextLine();
    
            Scanner console2 = new Scanner(System.in);
            System.out.println("HP : ");
            System.out.flush();
            int hpPokemon = console2.nextInt();
            
            Scanner console3 = new Scanner(System.in);
            System.out.println("Veuillez choisir et écrire l'une des énergies suivantes :");
            System.out.flush();
            
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            String nameEnergy = console3.nextLine();
            
            
            
        PokemonCard pokemon = new PokemonCard(nomPokemon, hpPokemon, energyType);
        System.out.println(pokemon.getCard());
    
        
        
    }
    }

    
    }
}
