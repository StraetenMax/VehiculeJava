# VehiculeJava

abstract class Vehicule{ }
On y mets soit des méthodes classique ou des
méthodes du même type et sans corps :
abstract class Vehicule{
abstract void demarrer(); //méthode abstraite
}Exemple
abstract class Vehicule {
protected String couleur;
protected int nbOccupants;
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

Je vous propose de créer la classe Vehicule avec ses constructeurs
(vide et avec paramètre), ses accesseurs et mutateurs. Ensuite,
décliner cette classe Véhicule en 2 sous classes : VehiculeAerien et
VehiculeTerrien.

La sous classe VehiculeAerien qui redéfinie les méthodes avancer et
seGarer en y affichant respectivement « J’avance aérien » et « Je
me gare aérien » et qui ajoute la propriété rayonAction (int en heure)
et la propriété boolean longCourrier qui est à true si rayonAction > 5,
sinon false.

La sous classe VehiculeTerrien qui redéfinie les méthodes avancer et
seGarer en y affichant respectivement « J’avance terrien » et « Je
me gare terrien ».

Dans ces 2 sous classes, adapter les constructeurs, accesseurs et
mutateurs si nécessaire.

A la sous classe VehiculeAerien, créer 2 sous
classes Avion et Helicoptere, qui redéfinissent
les propriétés avancer et seGarer en y affichant
respectivement « J’avance Avion » ou
« J’avance Helicoptere » et « Je me gare
Avion » ou « Je me gare Helicoptere » et qui
ajoute la propriété compagnie à Avion et le
boolean militaire (true/false).

Dans ces 2 sous classes, adapter les
constructeurs, accesseurs et mutateurs si
nécessaire.

A la sous classe VehiculeTerrien, créer 2 sous
classes Auto et Moto, qui redéfinissent les
propriétés avancer et seGarer en y affichant
respectivement « J’avance Auto » ou « J’avance
Moto » et « Je me gare Auto » ou « Je me gare
Moto » et qui ajoute la propriété nbPorte à Auto
et marque à Moto.

Dans ces 2 sous classes, adapter les
constructeurs, accesseurs et mutateurs si
nécessaire.
