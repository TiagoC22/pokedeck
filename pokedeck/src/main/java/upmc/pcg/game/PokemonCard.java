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



/**
 *
 * @author lepor
 */
public class PokemonCard {

   


    private String namePokemon;
    public static EnergyType energyType;
    private int hp;
  
    //Constructeur
    public PokemonCard(String namePokemon, int hp, EnergyType energyType) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.energyType = energyType;
    }
   
    //Accesseurs
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
   
    public String msgPokemon() {
        return "Vous avez crée "+namePokemon+" avec "+hp+" de point de vie,"+" et de type "+energyType;
}

public static List<PokemonCard> jeu = new ArrayList<PokemonCard>();
public static ArrayList<String> jeu1 = new ArrayList<String>();
public static ArrayList<Integer> jeu2 = new ArrayList<Integer>();
public static ArrayList<EnergyType> jeu3 = new ArrayList<EnergyType>();
public static PokemonCard getCarte() {
    return jeu.get(0);  
}
   
 public String getNameCard() {
     return jeu1.get(0);
 }
 
 public int getHpCard() {
     return jeu2.get(0);
 }
 
 public EnergyType getEnergyCard() {
     return jeu3.get(0);
 }
 
 
    public static void askPokemonCard() {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Nom du pokémon: ");
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
            System.out.println("\n");
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
        
        PokemonCard pokemon = new PokemonCard (namePokemon, hpPokemon, energyType);
        System.out.println(pokemon.msgPokemon());
      
        //jeu.add(pokemon);
        jeu1.add(namePokemon);
        jeu2.add(hpPokemon);
        jeu3.add(energyType);
       
        Scanner console4 = new Scanner(System.in);
       
        System.out.println("Voulez-vous ajouter une nouvelle carte ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console3.nextInt();
       
        if (yes_no == 1) {
            Menu menu = new Menu(); //Lancement du menu
            menu.start();
        }
        else {
        System.exit(0);
        }
       
    }
 
  }

  
 

