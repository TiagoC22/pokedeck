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
public class TrainerCard {
    public static TrainerType trainerType;//Type de la carte (
    private String nameTrainer; //Nom de la carte
    private String descriptionTrainer; //Description de la carte
   
    //Constructeur
    public TrainerCard(String nameTrainer, String descriptionTrainer, TrainerType trainerType) {	
        this.trainerType = trainerType;
        this.nameTrainer = nameTrainer;
        this.descriptionTrainer = descriptionTrainer;
        }	
        
    //Accesseurs
    public String getCardTrainer(){
        return nameTrainer+descriptionTrainer+trainerType;
    }
    
    public String getNameTrainer() {
        return nameTrainer;
    }
    
    public String getDescriptionTrainer() {
        return descriptionTrainer;
    }
    
    public TrainerType getTrainerType() {
        return trainerType;
    }
    
    public static void askTrainerCard() {
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
    
}

