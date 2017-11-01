
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;

import java.util.HashMap;
import java.util.Scanner;
import upmc.pcg.game.EnergyCard;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;
import upmc.pcg.game.TrainerCard;
import upmc.pcg.game.TrainerType;
import upmc.pcg.Paquet;
/**
 *
 * @author lepor
 */
public class ajoutCarte {
    private EnergyType energyType;
    private TrainerType trainerType;
    
    
    public void texte1() {
    
    Scanner t1 = new Scanner(System.in);
    System.out.println("Quel type de carte voulez-vous ajouté ?");
    System.out.println("[1] Pokemon");
    System.out.println("[2] Trainer");
    System.out.println("[3] Energy");
    System.out.println("[4] Revenir au menu");
    int choix = t1.nextInt();
  
    
    switch (choix) {
    // CAS DU POKEMON ------------------------------------- 
        case 1 : if (choix == 1) {
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
            
        PokemonCard pokemon = new PokemonCard (namePokemon, hpPokemon, energyType);
        System.out.println(pokemon.getCardPokemon());
        
        
        Scanner console4 = new Scanner(System.in);
        System.out.println("Voulez-vous ajouter un nouvelle carte ?");
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
        
    // CAS DU TRAINER ------------------------------------- 
    }
        case 2 : if (choix == 2) {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Nom du trainer: ");
            System.out.flush();
            String nameTrainer = console1.nextLine();
            
            Scanner console2 = new Scanner(System.in);
            System.out.println("Description : ");
            System.out.flush();
            String descriptionTrainer = console2.nextLine(); 
            
            System.out.println("Voici la liste des trainers :");
            
            
            for(TrainerType trainer : TrainerType.values()){
               System.out.print(trainer+" ,");
            }
            System.out.println(" ");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Veuillez choisir un Trainer (N'oubliez pas la majuscule):");
            System.out.flush();
            String TypeTrainer = console3.nextLine();
            
            if (TypeTrainer.equals("Item")) {
                trainerType = TrainerType.Item;
                }
            else if (TypeTrainer.equals("Stadium"))  {
                trainerType = TrainerType.Stadium;
            }
            else if (TypeTrainer.equals("Supporter")) {
                trainerType = TrainerType.Supporter;
            }
           
        TrainerCard trainer = new TrainerCard(nameTrainer, descriptionTrainer, trainerType);
        System.out.println(trainer.getCardTrainer());
        
        }
          
    // CAS DE ENERGY -------------------------------------    
        case 3 : if (choix == 3)  {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Nom de l'énergie : ");
            System.out.flush();
            String nameEnergy = console1.nextLine();
            
            System.out.println("Voici la liste des énergies :");
            
            
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            System.out.println(" ");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Veuillez choisir une énergie (N'oubliez pas la majuscule):");
            System.out.flush();
            String TypeEnergy = console3.nextLine();
            
            if (TypeEnergy.equals("Plante")) {
                    energyType = EnergyType.Plante;
                }
            else if (TypeEnergy.equals("Electrique"))  {
                    energyType = EnergyType.Electrique;
            }
            else if (TypeEnergy.equals("Eau")) {
                energyType = EnergyType.Eau;
            }
            else if (TypeEnergy.equals("Psy")) {
                energyType = EnergyType.Psy;
            }
            else if (TypeEnergy.equals("Feu")) {
                energyType = EnergyType.Feu;
            }
            else if (TypeEnergy.equals("Combat")) {
                energyType = EnergyType.Combat;
            }
            else if (TypeEnergy.equals("Métal")) {
                energyType = EnergyType.Métal;
            }
            else if (TypeEnergy.equals("Obscurité")) {
                energyType = EnergyType.Obscurité;
            }
            else if (TypeEnergy.equals("Fée")) {
                energyType = EnergyType.Fée;
            }
            else if (TypeEnergy.equals("Incolore")) {
                energyType = EnergyType.Incolore;
            }
            else if (TypeEnergy.equals("Dragon")) {
                energyType = EnergyType.Dragon;
            }
        EnergyCard energy = new EnergyCard(nameEnergy,energyType);
        System.out.println(energy.getCardEnergy());
        }
        
         case 4 : if (choix == 4 ) {
            Menu menu = new Menu(); //Lancement du menu
            menu.start();
        }
        
        }
    }

    
    }

    



