/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import upmc.pcg.Card;


/**
 *
 * @author Tiago
 */
public class TrainerCard extends Card {
    protected TrainerType trainerType;//type of card
    protected String nameTrainer; //name of card
    protected String descriptionTrainer; //description of card
   
    //Constructor
    public TrainerCard(int id, String descriptionTrainer, String nameTrainer, TrainerType trainerType) {
        super (id, nameTrainer, descriptionTrainer);
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

    @Override
    public String cardToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    


