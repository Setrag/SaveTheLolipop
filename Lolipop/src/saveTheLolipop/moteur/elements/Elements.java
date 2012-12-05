package saveTheLolipop.moteur.elements;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;

public abstract class Elements {
	private String nom;
	private Coordonnees coord;
	
	public Elements() {
		this.nom = "unnamed";
		this.coord = new Coordonnees();
<<<<<<< HEAD
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
=======
		this.ajoutElement();
	}

	public Elements(String nom) {
		this.nom = nom;
		this.coord = new Coordonnees();
		this.ajoutElement();
	}

	public Elements(String nom, Coordonnees coord) {
		this.nom = nom;
		this.coord = coord;
		this.ajoutElement();
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
	}

	public abstract void affiche();

<<<<<<< HEAD
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
=======
	public abstract void deplacement(int delta);

	public void ajoutElement() {
		Afficheur.addElemPresent(this);
		GestionnaireEvenement.addElemPresent(this);;
	}

	public void supElement() {
		Afficheur.delElemPresent(this);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
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