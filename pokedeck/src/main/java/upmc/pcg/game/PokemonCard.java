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
    
    private String namePokemon;
    private EnergyType energyType;
    private int hp;

    //Constructeur
    public PokemonCard(String namePokemon, int hp, EnergyType energyType) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.energyType = energyType;
    }
    
    //Accesseurs
    public String getCard(){
        return namePokemon+hp+energyType;
    }
    
    public int getHp() {
        return hp;
    }
    
    public EnergyType getEnergyType() {
        return energyType;
    }
    
    public static void askPokemonCard() {
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
    }
}
  
 

