package exerciceAbstract;

public class Auto extends VehiculeTerrien{
		//propriété
	private int nbPortes;
	
		//constructeur
	public Auto(){
		super();
		nbPortes = 0;
	}
	
	public Auto(String cCouleur,int cNbOccupants,int cNbPortes){
		super(cCouleur, cNbOccupants);
		nbPortes = cNbPortes;
	}
	
		//accesseurs mutateurs
		public int getNbPortes(){
			return nbPortes;
		}
		public void setNbPortes(int yNbPortes){
			nbPortes = yNbPortes;
		}
		
		//méthodes
		public void avancer(){
			System.out.println("J'avance Auto");
		}
		
		public void seGarer(){
			System.out.println("Je me gare Auto");
		}
	
}
