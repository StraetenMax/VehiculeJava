package exerciceAbstract;

public class VehiculeTerrien extends Vehicule {
	//propriété
	
	//constructeurs
	public VehiculeTerrien(){
		super();
	}
	public VehiculeTerrien(String cCouleur, int cNbOccupants){
		super(cCouleur, cNbOccupants);
	}
	
	// méthodes
	public void avancer(){
		System.out.println("J'avance Terrien");
	}
	public void seGarer(){
		System.out.println("Je me gare Terrien");
	}
}
