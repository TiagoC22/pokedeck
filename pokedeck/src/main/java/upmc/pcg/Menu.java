package upmc.pcg;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private SousMenu sousMenu;
	private String choix = "1";
	private Deck paquetJoueur;
		
	public Menu(Deck d, Scanner scanner) {
		this.sc = scanner;
		sousMenu = new SousMenu(scanner);
		paquetJoueur = d;
	}
	
	public void start() {
		System.out.println("BONJOUR UTILISATEUR");
		System.out.println("Que voulez-vous faire ?");
		System.out.println("------------------------");
		
		while (Integer.parseInt(choix) != 0) {
			menu();
			choix_utilisateur();
		}
	}
	
	public void menu() {
		System.out.println("--------- MENU ---------");
		System.out.println("0 - QUITTER");
		System.out.println("1 - VOIR POKEDECK");
		System.out.println("2 - AJOUTER CARTE (POKEMON, ENERGIE, DRESSEUR)");
		System.out.println("3 - SUPPRIMER CARTE");
		System.out.println("4 - MODIFIER CARTE (AJOUTER DESCRIPTION)");
		System.out.println("5 - RECHERCHER (DIFFERENTES OPTIONS)");
	}
	
	public void choix_utilisateur() {
		
		choix = sc.nextLine();
		if (choix.equals("")) {
			choix = "0";
			System.out.println("Choix vide --- QUITTER");
		}
		System.out.println("------------------------");
		
		int n = Integer.parseInt(choix);
		
		switch(n) {
			case 0 :
				// QUITTER
				System.out.println("Vous venez de quitter.");
				System.out.println("------------------------");
				break;
			case 1 :
				// VOIR POKEDECK
				sousMenu.parcoursDeck(paquetJoueur);
				System.out.println("------------------------");
				break;
			case 2 :
				// AJOUTER CARTE
				sousMenu.ajoutCarteDansDeck(paquetJoueur);
				System.out.println("------------------------");
				break;
			case 3 :
				// SUPPRIMER CARTE
				sousMenu.supprimerCarteDansDeck(paquetJoueur);
				System.out.println("------------------------");
				break;
			case 4 :
				// MODIFIER CARTE
				sousMenu.modifierCarteDansDeck(paquetJoueur);
				System.out.println("------------------------");
				break;
			case 5 :
				// RECHERCHER CARTE
				sousMenu.rechercherCarte(paquetJoueur);
				System.out.println("------------------------");
				break;
			default :
				System.out.println("Ce n'est pas un choix valide !");
				break;
		}

	}
}