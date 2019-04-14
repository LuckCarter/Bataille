import java.util.ArrayList;

public class joueur 
{
	private int score;//score joueur
	private ArrayList<carte> paquetjoueur;	//liste de cartes
	private String nom;//nom joueur

	//Constructeur joueur
	public joueur(String nom)
	{
		this.score = 0;
		this.paquetjoueur = new ArrayList<carte>();
		this.nom = nom;
	}
	
	//Getter score du joueur
	public int getscore()
	{
		return this.score;
	}
	
	//Getter nom du joueur 
	public String getnom()
	{
		return this.nom;
	}

	//Getter liste de cartes
	public ArrayList<carte> getcarte()
	{
		return this.paquetjoueur;
	}

	//Methode ajouteunecarte
	public void ajouteunecarte(carte carte) 
	{
		this.paquetjoueur.add(carte);
	}

	//Methode tireunecarte
	public void tireunecarte(carte carte)
	{
		this.paquetjoueur.remove(carte);
	}
	
	//Methode augmente le score du joueur
	public void gagner() 
	{
		this.score++;
	}
	
}
