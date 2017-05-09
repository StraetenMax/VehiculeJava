package exerciceAbstract;

public class Avion extends VehiculeAerien {
	//propriétés
	protected String compagnie;
	protected boolean militaire;
	
	//constructeur
	public Avion(){
		super();
		compagnie = "";
		militaire = false;
	}
	public Avion(String cCouleur, int cNbOccupants, int cHeure, String cCompagnie, boolean cMilitaire){
		super(cCouleur, cNbOccupants, cHeure);
		compagnie = cCompagnie;
		militaire = cMilitaire;
	}
	//accesseurs mutateurs
	public String getCompagnie(){
		return compagnie;
	}
	
	public boolean getMilitaire(){
		return militaire;
	}
	
	public void setCompagnie(String yCompagnie){
		compagnie = yCompagnie;
	}
	public void setMilitaire(boolean yMilitaire){
		militaire = yMilitaire;
	}
	//méthodes
	public void avancer(){
		System.out.println("J'avance Avion");
	}
	public void seGarer(){
		System.out.println("Je me gare Avion");
	}
	
}
