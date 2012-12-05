package saveTheLolipop.moteur.elements;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;

public abstract class Elements {
	private String nom;
	private Coordonnees coord;
	private Integer profondeurAffichage;
	
	public Elements() {
		this.nom = "unnamed";
		this.coord = new Coordonnees();
		this.profondeurAffichage = 1;
	}
	
	public Elements(String nom, Integer profondeurAffichage) {
		this.nom = nom;
		this.coord = new Coordonnees();
		this.profondeurAffichage = profondeurAffichage;
	}
	
	public Elements(String nom, Coordonnees coord, Integer profondeurAffichage) {
		this.nom = nom;
		this.coord = coord;
		this.profondeurAffichage = profondeurAffichage;
	}

	public abstract void affiche();

	public abstract void verificationEvenement();
	
	public void ajoutElementAffiche() {
		Afficheur.addElemPresent(this, profondeurAffichage);
	}
	public void ajoutElementEvenement() {
		GestionnaireEvenement.addElemPresent(this);;
	}

	public void supElementAffiche() {
		Afficheur.delElemPresent(this, profondeurAffichage);
	}
	public void supElementEvenement() {
		GestionnaireEvenement.delElemPresent(this);;
	}

	// ////////////////////////////
	// getteur-setteur //
	// ////////////////////////////
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Coordonnees getCoord() {
		return coord;
	}

	public void setCoord(Coordonnees coord) {
		this.coord = coord;
	}

}