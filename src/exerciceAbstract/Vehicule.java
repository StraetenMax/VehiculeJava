package exerciceAbstract;

abstract class Vehicule {
	//propriétés
	protected String couleur;
	protected int nbOccupants;
	
	//constructeurs
	protected Vehicule(){
		couleur = "";
		nbOccupants = 0;
	}
	
	protected Vehicule(String cCouleur, int cNbOccupants){
		couleur = cCouleur;
		nbOccupants = cNbOccupants;
	}
	
	//accesseurs mutateurs
	public String getCouleur(){
		return couleur;
	}
	
	public int nbOccupants(){
		return nbOccupants;
	}
	
	public void setCouleur(String yCouleur){
		couleur = yCouleur;
	}
	
	public void setnbOccupants(int yNbOccupants){
		nbOccupants = yNbOccupants;
	}
	
	//méthodes
	protected void demarrer(){
		System.out.println("Je demarre");
	}

	protected void arreter(){
		System.out.println("Je m’arrete");
	}
	
	abstract void avancer();
	abstract void seGarer();
	
	public String description(){
		String str = "Je suis un objet de la " + this.getClass() +
", je suis " + this.couleur + ", je contient " + this.nbOccupants + " occupants ";
		return str;
	}
	
	
}

