package exerciceAbstract;

public class VehiculeAerien extends Vehicule {
	//propriétés
	protected int heure;
	protected boolean longCourrier;
	
	//constructeurs
	public VehiculeAerien(){
		super();
		heure = 0;
		this.setLongCourrier();
	}
	public VehiculeAerien(String cCouleur, int cNbOccupants, int cHeure){
		super(cCouleur, cNbOccupants);
		heure = cHeure;
		this.setLongCourrier();
	}
	//accesseurs et mutateurs
	public int getHeure(){
		return heure;
	}
	
	public boolean getLongCourrier(){
		return longCourrier;
	}
	
	public void setHeure(int yHeure){
		heure = yHeure;
		this.setLongCourrier();
	}
	
	public void setLongCourrier(){
		if(heure >5){
			longCourrier = true;
		}else{
			longCourrier = false;
		}
	}
	//méthodes redéfinies
	public void avancer(){
		System.out.println("J'avance Aérien");
	}
	public void seGarer(){
		System.out.println("Je me gare Aérien");
	}
}
