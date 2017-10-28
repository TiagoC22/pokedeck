/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import java.util.Scanner;

/**
 *
 * @author lepor
 */
public class PokemonCard {
    
    public void texte2() {
    Scanner pok = new Scanner(System.in);
    System.out.println("Nom : ");
    System.out.flush();
    String nomPokemon = pok.nextLine();
    
    System.out.println("HP : ");
    System.out.flush();
    int hpPokemon = pok.nextInt();
    
    System.out.println("Sélectionner l'une des énergies suivantes :");
    System.out.flush();
    String energyPokemon = pok.nextLine();
    for(EnergyType energy : EnergyType.values()){

      System.out.print(energy+" ,");

      
    }
        
    }
}
