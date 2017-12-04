/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import upmc.pcg.Menu;
import upmc.pcg.addCard;



/**
 *
 * @author lepor
 */
public class PokemonCard {


    private String namePokemon;
    public static EnergyType energyType;
    private int hp;
  
    //Constructor
    public PokemonCard(String namePokemon, int hp, EnergyType energyType) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.energyType = energyType;
    }
   
    //Accessors
    public String getCardPokemon(){
        return namePokemon+hp+energyType;
    }
   
    public String getNamePokemon() {
        return namePokemon;
    }
    
    public int getHpPokemon() {
        return hp;
    }
   
    public EnergyType getEnergyTypePokemon() {
        return energyType;
    }
    
    public String toString() {
       return namePokemon+" "+hp+" "+energyType;
    }
   
    public String msgPokemon() {
        return "You have create "+namePokemon+" with "+hp+" life points,"+" and with the energy "+energyType;
    }

public static List<PokemonCard> jeu = new ArrayList<PokemonCard>(); //Declaration of the array

public static PokemonCard getArrayPokemon() {
    for (int x=0; x<jeu.size(); x++) {
        return jeu.get(x);
    }
        return null;
     
}

 
    public static void askPokemonCard() {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Name of Pokemon: ");
            System.out.flush();
            String namePokemon = console1.nextLine();
            
            
            Scanner console2 = new Scanner(System.in);
            System.out.println("HP : ");
            System.out.flush();
            int hpPokemon = console2.nextInt();
            
           
          
            System.out.println("Here is the list of energy's :");
           
           
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            System.out.println("\n");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Please choose an energy (Don't forget the capital letter) :");
            System.out.flush();
            String nameEnergy = console3.nextLine();
         
            //compare user choice with energy type
            if (nameEnergy.equals("Grass")) {
                energyType = EnergyType.Grass;
            }
            else if (nameEnergy.equals("Lightning"))  {
                energyType = EnergyType.Lightning;
            }
            else if (nameEnergy.equals("Water")) {
                energyType = EnergyType.Water;
            }
            else if (nameEnergy.equals("Psy")) {
                energyType = EnergyType.Psy;
            }
            else if (nameEnergy.equals("Fire")) {
                energyType = EnergyType.Fire;
            }
            else if (nameEnergy.equals("Fighting")) {
                energyType = EnergyType.Fighting;
            }
            else if (nameEnergy.equals("Metal")) {
                energyType = EnergyType.Metal;
            }
            else if (nameEnergy.equals("Darkness")) {
                energyType = EnergyType.Darkness;
            }
            else if (nameEnergy.equals("Fairy")) {
                energyType = EnergyType.Fairy;
            }
            else if (nameEnergy.equals("Incolore")) {
                energyType = EnergyType.Incolore;
            }
            else if (nameEnergy.equals("Dragon")) {
                energyType = EnergyType.Dragon;
            }
        
        jeu.add(new PokemonCard(namePokemon, hpPokemon, energyType)); //add pokemon object in the array
        PokemonCard pokemon = new PokemonCard (namePokemon, hpPokemon, energyType);
        jeu.add(pokemon);
        System.out.println(pokemon.msgPokemon());
        
        
        Scanner console4 = new Scanner(System.in);
       
        System.out.println("Do you want to add a new card ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console4.nextInt();
       
        if (yes_no == 1) {
            addCard ajoutc = new addCard(); //run addCard class
            ajoutc.askAddCard(); //run method
        }
        else {
            Menu menu = new Menu(); //run menu
            menu.start();
        }
       
    }
 
  }

  
 

