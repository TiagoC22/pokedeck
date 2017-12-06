package upmc.pcg;



import java.util.Scanner;


public class Pokedeck
{
  public static void main(String[] args)
  {
      Deck game = new Deck();
      Scanner scanner =  new Scanner(System.in);
      Menu menu = new Menu(game, scanner);
      menu.start();
  }
  

}
  
  

