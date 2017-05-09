package exerciceAbstract;

public class Helicoptere extends VehiculeAerien {
	//propriété
	
	//constructeur
	public Helicoptere(){
		super();
	}
	
	public Helicoptere(String cCouleur, int cNbOccupants, int cHeure){
		super(cCouleur, cNbOccupants, cHeure);
	}
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance Hélicoptère");
	}
	
	public void seGarer(){
		System.out.println("Je me gare Hélicoptère");
	}
	
	
	
}
