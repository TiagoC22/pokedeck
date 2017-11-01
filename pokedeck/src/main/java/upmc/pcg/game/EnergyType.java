/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;



/**
 *
 * @author lepor
 */

public class EnergyType {

    
public enum EnumEnergy { //Type d'energies
        Plante,
        Electrique,
        Eau,
        Psy,
        Feu,
        Combat,
        Métal,
        Obscurité,
        Fée,
        Incolore,
        Dragon;
       
}
     
public static void energyCompare(String nameEnergy, EnumEnergy energyType) {
  
if (nameEnergy.equals("Plante")) {
                energyType = EnumEnergy.Plante;
                }
            else if (nameEnergy.equals("Electrique"))  {
                energyType = EnumEnergy.Electrique;
            }
            else if (nameEnergy.equals("Eau")) {
                energyType = EnumEnergy.Eau;
            }
            else if (nameEnergy.equals("Psy")) {
                energyType = EnumEnergy.Psy;
            }
            else if (nameEnergy.equals("Feu")) {
                energyType = EnumEnergy.Feu;
            }
            else if (nameEnergy.equals("Combat")) {
                energyType = EnumEnergy.Combat;
            }
            else if (nameEnergy.equals("Métal")) {
                energyType = EnumEnergy.Métal;
            }
            else if (nameEnergy.equals("Obscurité")) {
                energyType = EnumEnergy.Obscurité;
            }
            else if (nameEnergy.equals("Fée")) {
                energyType = EnumEnergy.Fée;
            }
            else if (nameEnergy.equals("Incolore")) {
                energyType = EnumEnergy.Incolore;
            }
            else if (nameEnergy.equals("Dragon")) {
                energyType = EnumEnergy.Dragon;
            }
}
}