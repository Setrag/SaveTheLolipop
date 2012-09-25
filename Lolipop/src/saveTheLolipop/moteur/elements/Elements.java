package saveTheLolipop.moteur.elements;

import saveTheLolipop.moteur.utilitaire.Coordonnees;

public abstract class Elements {
	private String nom;
	private Coordonnees coord;

	public Elements() {
		this.nom = "unnamed";
		this.coord = new Coordonnees();
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
	}

	public abstract void affiche();

	public abstract void deplacement(int delta);

	public abstract void ajoutElement();

	public abstract void supElement(Elements e);

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