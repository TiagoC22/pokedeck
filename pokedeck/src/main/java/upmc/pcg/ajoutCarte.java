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
            String namePokemon = console1.nextLine();
    
            Scanner console2 = new Scanner(System.in);
            System.out.println("HP : ");
            System.out.flush();
            int hpPokemon = console2.nextInt(); 
            
           
            System.out.println("Voici la liste des énergies :");
            
            
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            System.out.println(" ");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Veuillez choisir et écrire l'une des énergies (N'oubliez pas la majuscule):");
            System.out.flush();
            String nameEnergy = console3.nextLine();
            
            //Attribution du choix utilisateur (énergie) au type energyType
            if (nameEnergy.equals("Plante")) {
                    energyType = EnergyType.Plante;
                }
            else if (nameEnergy.equals("Electrique"))  {
                    energyType = EnergyType.Electrique;
            }
            else if (nameEnergy.equals("Eau")) {
                energyType = EnergyType.Eau;
            }
            else if (nameEnergy.equals("Psy")) {
                energyType = EnergyType.Psy;
            }
            else if (nameEnergy.equals("Feu")) {
                energyType = EnergyType.Feu;
            }
            else if (nameEnergy.equals("Combat")) {
                energyType = EnergyType.Combat;
            }
            else if (nameEnergy.equals("Métal")) {
                energyType = EnergyType.Métal;
            }
            else if (nameEnergy.equals("Obscurité")) {
                energyType = EnergyType.Obscurité;
            }
            else if (nameEnergy.equals("Fée")) {
                energyType = EnergyType.Fée;
            }
            else if (nameEnergy.equals("Incolore")) {
                energyType = EnergyType.Incolore;
            }
            else if (nameEnergy.equals("Dragon")) {
                energyType = EnergyType.Dragon;
            }
            
        PokemonCard pokemon = new PokemonCard(namePokemon, hpPokemon, energyType);
        System.out.println(pokemon.getCard());
    
        
        
    }
    }

    
    }
}
