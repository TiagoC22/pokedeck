/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upmc.pcg;
import java.util.Scanner;


public class Pokedeck
{
    public static void main(String[] args)
    {
        Deck game = new Deck();
        Scanner scanner =  new Scanner(System.in);
        Menu menu = new Menu(scanner, game);
        menu.start(); //Run the pokedeck programm
    }
}
  
  

