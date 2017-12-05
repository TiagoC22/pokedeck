package Pokedeck.utilisateur;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck paquet = new Deck();
		Scanner scanner =  new Scanner(System.in);
		Menu m = new Menu(paquet, scanner);
		m.depart();
		
	}

}
