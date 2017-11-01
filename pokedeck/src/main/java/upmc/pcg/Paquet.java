/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;

import java.util.HashMap;
import upmc.pcg.game.EnergyType;
import upmc.pcg.game.PokemonCard;

/**
 *
 * @author lepor
 */
public class Paquet {



    HashMap<Integer, String> paquet = new HashMap<>();
   
    public void put(Integer in, String name) {
        paquet.put(in,name);
    }
   
  
   
    public void getPaquet() {
        System.out.println(paquet);
    }
}
