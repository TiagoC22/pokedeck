package Pokedeck.utilisateur;

import java.util.Scanner;

import Pokedeck.pokemon.*;

public class SousMenu {

	private Scanner sc;
	private String choix;
	private int n;

	public SousMenu(Scanner sc) {
		this.sc = sc;
	}

	// --------------------------------------------------

	public void parcoursDeck(Deck paquet) {
		if (paquet.tailleDeck() == 0) {
			System.out.println("Le paquet est vide");
		} else {
			paquet.parcoursDeck();
		}
	}

	// --------------------------------------------------

	public int choixAjoutTypeCarte() {
		System.out.println("Vous voulez ajouter une carte... ?");
		System.out.println("1 - POKEMON \t2 - DRESSEUR\t3 - ENERGIE");
		choix = sc.nextLine();
		int n = Integer.parseInt(choix);
		return n;
	}

	public Carte retourneCarteCreee(Deck paquet, int n) {
		int i;
		int numCarte;
		switch (n) {
		case 1:
			// CARTE POKEMON
			// Param�tres:
			TypeEnergie energie;
			PokemonStage stage;
			String nomPokemon;
			int pointDeVie;

			System.out.println("Choix du Type de POKEMON :");
			i = 0;
			for (TypeEnergie type : TypeEnergie.values()) {
				System.out.println(i + " - " + type);
				i++;
			}

			// Choix de l'Energie
			choix = sc.nextLine();
			n = Integer.parseInt(choix);
			energie = TypeEnergie.values()[n];

			// Choix du nom du Pokemon
			System.out.println("Choix du Nom du POKEMON :");
			nomPokemon = sc.nextLine();

			// Choix du Stage du pokemon
			System.out.println("Choix du Nombre du Stage du POKEMON :");
			i = 0;
			for (PokemonStage s : PokemonStage.values()) {
				System.out.println(i + " - " + s);
				i++;
			}
			choix = sc.nextLine();
			n = Integer.parseInt(choix);
			stage = PokemonStage.values()[n];

			// Choix du nombre de HP du Pokemon
			System.out.println("Choix du Nombre de HP du POKEMON :");
			choix = sc.nextLine();
			pointDeVie = Integer.parseInt(choix);

			// Choix du num�ro de carte
			do {
				System.out.println("Choix du num�ro de la Carte :");
				choix = sc.nextLine();
				numCarte = Integer.parseInt(choix);

				if (paquet.existeDansDeck(numCarte))
					System.out.println("La carte existe d�j�, rentrez un nouveau nombre");

			} while (paquet.existeDansDeck(numCarte));

			return new CartePokemon(numCarte, energie, nomPokemon, pointDeVie,
					stage);
		case 2:
			// CARTE DRESSEUR
			// params
			TypeDresseur dresseur;
			String nomObjet;

			System.out.println("Choix du Type de DRESSEUR :");
			i = 0;
			for (TypeDresseur type : TypeDresseur.values()) {
				System.out.println(i + " - " + type);
				i++;
			}

			// Choix du Dresseur
			choix = sc.nextLine();
			n = Integer.parseInt(choix);
			dresseur = TypeDresseur.values()[n];

			// Choix du nom de l'Objet Dresseur
			System.out.println("Choix du Nom de l'Objet Dresseur :");
			nomObjet = sc.nextLine();

			// Choix du num�ro de carte
			do {
				System.out.println("Choix du num�ro de la Carte :");
				choix = sc.nextLine();
				numCarte = Integer.parseInt(choix);

				if (paquet.existeDansDeck(numCarte))
					System.out.println("La carte existe d�j�, rentrez un nouveau nombre");

			} while (paquet.existeDansDeck(numCarte));

			return new CarteDresseur(numCarte, dresseur, nomObjet);

		case 3:
			// CARTE ENERGIE
			// parametre
			TypeEnergie energie2;

			System.out.println("Choix du Type d'Energie :");
			i = 0;
			for (TypeEnergie type : TypeEnergie.values()) {
				if (i != 10) {
					System.out.println(i + " - " + type);
					i++;
				}
			}

			// Choix de l'Energie
			choix = sc.nextLine();
			n = Integer.parseInt(choix);
			energie2 = TypeEnergie.values()[n];

			// Choix du num�ro de carte
			do {
				System.out.println("Choix du num�ro de la Carte :");
				choix = sc.nextLine();
				numCarte = Integer.parseInt(choix);

				if (paquet.existeDansDeck(numCarte))
					System.out.println("La carte existe d�j�, rentrez un nouveau nombre");

			} while (paquet.existeDansDeck(numCarte));

			return new CarteEnergie(numCarte, energie2);

		default:
			System.out.println("Choix invalide !");
			System.out.println("FIN");
			return null;
		}
	}

	public void ajoutCarteDansDeck(Deck paquet) {
		n = choixAjoutTypeCarte();
		Carte c = retourneCarteCreee(paquet, n);
		paquet.ajouterCarte(c);
	}

	// --------------------------------------------------

	public void supprimerCarteDansDeck(Deck paquet) {

		System.out.println("Vous voulez supprimer une carte... ?");
		System.out.println("Rentrez le num�ro de la carte � supprimer");
		choix = sc.nextLine();
		int num = Integer.parseInt(choix);

		if (!paquet.existeDansDeck(num)) {
			System.out.println("Numero invalide ! Recommencez !");
		} else {
			if (paquet.enleverCarte(num))
				System.out.println("Carte retir�e du Deck !");
			else
				System.out.println("Suppression echouee...");
		}
	}

	// --------------------------------------------------

	public void modifierCarteDansDeck(Deck paquet) {
		System.out.println("Vous voulez modifier une carte... ?");
		System.out.println("Rentrez le num�ro de la carte � modifier");
		System.out.println("A noter que le changement ne concerne que la description de la carte");
		choix = sc.nextLine();
		int num = Integer.parseInt(choix);

		if (!paquet.existeDansDeck(num)) {
			System.out.println("Numero invalide ! Recommencez !");
		} else {
			System.out.println("Rentrez la description de la carte :");
			String desc = sc.nextLine();
			paquet.ajouterDescriptionALaCarte(num, desc);
		}
	}

	// --------------------------------------------------

	public int choixRechercheCarte() {
		System.out.println("Rechercher la carte par... ?");
		System.out.println("1 - NUMERO CARTE \t2 - NOM/TYPE CARTE");
		choix = sc.nextLine();
		n = Integer.parseInt(choix);

		return n;
	}

	public void afficheCarteRecherchee(Deck paquet, int n) {
		switch (n) {
		case 1:
			System.out.println(rechercheParNumero(paquet).carteToString());
			break;
		case 2:
			// RECHERCHE PAR NOM/TYPE
			// Choix du TYPE
			System.out.println("RECHERCHE par... ?");
			System.out.println("1 - TYPE CARTE \t2 - NOM CARTE");
			choix = sc.nextLine();
			int num = Integer.parseInt(choix);

			switch (num) {
			case 1:
				// RECHERCHE PAR TYPE
				String nom;

				// AFFICHAGE DE TOUTES LES CARTES DE TYPE...
				System.out.println("Rechercher la carte par... ?");
				System.out.println("1 - POKEMON \t2 - DRESSEUR \t3 - ENERGIE");
				System.out.println("Par d�faut : Pokemon");
				choix = sc.nextLine();

				if (choix.equals("")) {
					choix = "1";
				}

				int numchoix = Integer.parseInt(choix);

				nom = "Pokemon";
				if (numchoix == 2)
					nom = "Dresseur";
				if (numchoix == 3)
					nom = "Energie";

				paquet.afficheCartesParType(nom);

				break;
			case 2:
				// RECHERCHE PAR NOM CARTE
				// AFFICHAGE DE TOUTES LES CARTES DONT LE NOM EST...
				System.out.println("Rechercher la CARTE par NOM :");
				nom = sc.nextLine();

				paquet.afficheCartesParNom(nom);

				break;
			default:
				System.out.println("Recherche Impossible");
				break;
			}

			break;
		default:
			System.out.println("Choix invalide !");
			System.out.println("FIN");
		}
	}

	public Carte rechercheParNumero(Deck paquet) {
		// RECHERCHE PAR NUMERO
		int numCarte;

		// Choix du num�ro de carte
		do {
			System.out.println("NUMERO de la CARTE :");
			choix = sc.nextLine();
			numCarte = Integer.parseInt(choix);

			if (!paquet.existeDansDeck(numCarte))
				System.out.println("La carte n'existe pas dans le deck ! Recommencez !");
		} while (!paquet.existeDansDeck(numCarte));

		return paquet.retourneCarteDansDeck(numCarte);
	}

	public void rechercherCarte(Deck paquet) {
		n = choixRechercheCarte();
		afficheCarteRecherchee(paquet, n);
	}

	// --------------------------------------------------

}
