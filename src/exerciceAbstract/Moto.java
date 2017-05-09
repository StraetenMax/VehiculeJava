package exerciceAbstract;

public class Moto extends VehiculeTerrien {
		//propriétés
	private String marque;
	
		//constructeurs
	public Moto(){
		super();
		marque = "";
	}
	public Moto(String cCouleur,int cNbOccupants,String cMarque){
		super(cCouleur, cNbOccupants);
		marque = cMarque;
	}
	
		//accesseurs mutateurs
	public String getMarque(){
		return marque;
	}
	
	public void setMarque(String yMarque){
		marque = yMarque;
	}
	//méthodes
	public void avancer(){
		System.out.println("J'avance Moto");
	}
	public void seGarer(){
		System.out.println("Je me gare Moto");
	}
}
