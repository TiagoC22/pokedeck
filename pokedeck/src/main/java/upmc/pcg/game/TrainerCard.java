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
public class TrainerCard {
    public static TrainerType trainerType;//type of card
    private String nameTrainer; //name of card
    private String descriptionTrainer; //description of card
   
    //Constructor
    public TrainerCard(String nameTrainer, String descriptionTrainer, TrainerType trainerType) {	
        this.trainerType = trainerType;
        this.nameTrainer = nameTrainer;
        this.descriptionTrainer = descriptionTrainer;
        }	
        
    //Accessors
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
    public String toString() {
       return nameTrainer+" "+descriptionTrainer+" "+trainerType;
    }
   
    public String msgTrainer() {
        return "You have create "+nameTrainer+" with the following description : "+descriptionTrainer+" and the type "+trainerType;
    }
    
public static List<TrainerCard> jeu = new ArrayList<TrainerCard>(); //declaration of the array

    public static TrainerCard getArrayTrainer() {
    for (int x=0; x<jeu.size(); x++) {
       return jeu.get(x);
    }
        return null;
     
}

    
    public static void askTrainerCard() {
           
            Scanner console1 = new Scanner(System.in);
            System.out.println("Name of trainer: ");
            System.out.flush();
            String nameTrainer = console1.nextLine();
            
            Scanner console2 = new Scanner(System.in);
            System.out.println("Description : ");
            System.out.flush();
            String descriptionTrainer = console2.nextLine(); 
            
            System.out.println("Here is the list of trainer's  :");
            
            
            for(TrainerType trainer : TrainerType.values()){
               System.out.print(trainer+" ,");
            }
            System.out.println(" ");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Please choose a trainer (Don't forget the capital letter) :");
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
           
        jeu.add(new TrainerCard(nameTrainer, descriptionTrainer, trainerType));
        TrainerCard trainer = new TrainerCard(nameTrainer, descriptionTrainer, trainerType);
        jeu.add(trainer);
        System.out.println(trainer.msgTrainer());
        
        
        Scanner console4 = new Scanner(System.in);
       
        System.out.println("Do you want to add a new card ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console4.nextInt();
       
        if (yes_no == 1) {
            addCard ajoutc = new addCard(); //run addCard class
            ajoutc.askAddCard(); //run method askAddCard
        }
        else {
            Menu menu = new Menu(); //run menu
            menu.start();
        }
    }
    
}

