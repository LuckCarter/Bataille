public class carte 
{
	private String couleur;// Variable couleur de carte
	private int valeur;// Variable valeur de carte
	public static String[] tabcouleur = new String[] {"Coeur","Trèfle","Pique","Carreau"};// Tableau des couleurs de carte
	public static String[] tabvaleur = new String[] {"deux","trois","quatre","cinq","six","sept","huit","neuf","dix","valet","dame","roi","as"};// Tableau de valeurs de carte
	
	//Constructeur carte
	public carte(String couleur, int valeur)
	{
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	//Getter couleur de la carte
	public String getcouleur()
	{
		return this.couleur;
	}
	
	//Getter valeur de la carte
	public int getvaleur()
	{
		return this.valeur;
	}
	
	//Methode comparateur
	public int comparateur(carte carte2)
	{
		if(this.valeur == carte2.getvaleur()) //si les valeurs sont identiques
			return 2;
		else if(this.valeur > carte2.getvaleur())//SI la valeur de la carte superieure a la valeur de la carte en param
			return 1;
		else 
			return 0;
	}
	
	//Methode affichage carte
	public String toString()
	{
		return this.valeur + " de " + this.couleur;
	}
}
