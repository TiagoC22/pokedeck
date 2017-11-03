/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import upmc.pcg.Menu;
import upmc.pcg.ajoutCarte;



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
   public String toString() {
       return namePokemon+hp+energyType;
   }
   
    public String msgPokemon() {
        return "Vous avez crée "+namePokemon+" avec "+hp+" de point de vie,"+" et de type "+energyType;
}

public static List<PokemonCard> jeu = new ArrayList<PokemonCard>();

public static PokemonCard getCarte() {
    for (int x=0; x<jeu.size(); x++) {
       return jeu.get(x);
    }
        return null;
     
}
private int stId;


public boolean setIdNum(int id)
    {
        this.stId = id;
        id++;
        return true;
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
        
        jeu.add(new PokemonCard(namePokemon, hpPokemon, energyType)); // Création objet + ajout dans Array
        for (int i=0; i<999; i++) {
        
        PokemonCard pokemon = new PokemonCard (namePokemon, hpPokemon, energyType);
        
        pokemon.setIdNum(i); 
        jeu.add(pokemon);
        }
        
        
       
        
       
       
        Scanner console4 = new Scanner(System.in);
       
        System.out.println("Voulez-vous ajouter une nouvelle carte ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console3.nextInt();
       
        if (yes_no == 1) {
        ajoutCarte ajoutc = new ajoutCarte(); //Lance la classe ajoutCarte
        ajoutc.texte1(); //Lancement méthode
        }
        else {
        Menu menu = new Menu(); //Lancement du menu
        menu.start();
        }
       
    }
 
  }

  
 

