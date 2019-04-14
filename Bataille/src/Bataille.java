import java.util.ArrayList;
import java.util.Collections;

public class Bataille 
{
	public static void main(String[] args) 
	{
		// Initialisation de deux joueurs
		joueur joueur1 = new joueur("joueur1");
		joueur joueur2 = new joueur("joueur2");
		
		// Initialisation d'une liste de carte
		ArrayList<carte> paquet = new ArrayList<carte>();
		
		// Initialisation du paquet de cartes
		for(int i = 0 ; i < carte.tabcouleur.length ; i++) {
			for(int j = 0 ; j < carte.tabvaleur.length; j++) {
				carte carte = new carte(carte.tabcouleur[i], carte.tabvaleur[j]);
				paquet.add(carte);				
			}
		}
		
		// Melange le paquet
		Collections.shuffle(paquet);
		
		// Distribution des cartes pour chaque joueur
		for(int k = 0 ; k < paquet.size(); k = k + 2) {
			joueur1.ajouteunecarte(paquet.get(k));
			joueur2.ajouteunecarte(paquet.get(k+1));
		}
		
		// tant que les paquets ne sont pas a 0
		while(joueur1.getcarte().size() != 0 && joueur2.getcarte().size() != 0) {
			
			// recupere la premiere carte du paquet du joueur1
			carte carteJ1 = joueur1.getcarte().get(0);
			joueur1.tireunecarte(carteJ1);
			// recupere la premiere carte du paquet du joueur2
			carte carteJ2 = joueur2.getcarte().get(0);
			joueur2.tireunecarte(carteJ2);
			
			// Si la valeur de la carte du joueur1 est superieure
			if(carteJ1.comparateur(carteJ2) == 1) {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				joueur1.ajouteunecarte(carteJ1);
				joueur1.ajouteunecarte(carteJ2);
				joueur1.gagner();
				System.out.println(joueur1.getnom() + " gagné ! score : " + joueur1.getscore());
				System.out.println(joueur2.getnom() + " perdu ! score : " + joueur2.getscore());
			}
			
			// Si la valeur de la carte du joueur2 est superieure
			else if(carteJ1.comparateur(carteJ2) == 0) {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				joueur2.ajouteunecarte(carteJ2);
				joueur2.ajouteunecarte(carteJ1);
				joueur2.gagner();
				System.out.println(joueur1.getnom() + " perdu ! score : " + joueur1.getscore());
				System.out.println(joueur2.getnom() + " gagné ! score : " + joueur2.getscore());
			}
			// Si la valeur des cartes sont egales
			else {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				System.out.println("** Egalité ! ");	
			}
			System.out.println();
		}
		
		// affichage du gagnant
		if(joueur1.getscore() > joueur2.getscore()) 
			System.out.println(joueur1.getnom() + " a gagné ! ");
		else if(joueur2.getscore() > joueur1.getscore()) 
			System.out.println(joueur2.getnom() + " a gagné ! ");
		else
			System.out.println("Egalité ! ");
	}
}
