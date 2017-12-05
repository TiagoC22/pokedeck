
package upmc.pcg.game;

import upmc.pcg.Card;

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
} 
    


