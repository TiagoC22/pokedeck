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
    
    //Getters
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
} 
    


