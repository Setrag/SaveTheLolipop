package saveTheLolipop.moteur.elements.menus;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.ClicBouton;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.ActionBouton;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;

public class Bouton extends Elements {
	private Integer largeur;
	private Integer hauteur;
	private Color font;
	private Color ecriture;
	private ActionBouton action;

<<<<<<< HEAD
	public Bouton(String nom, ActionBouton action, Coordonnees coord, Integer largeur, Integer hauteur) {
		super(nom, coord, 1);
=======
	public Bouton(String nom, ActionBouton action, Coordonnees coord,
			Integer largeur, Integer hauteur) {
		super(nom, coord);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.action = action;
		this.font = Color.gray;
		this.ecriture = Color.white;
		GestionnaireEvenement.addElemPresent(this);
	}
	
	public Bouton(String nom, ActionBouton action, Coordonnees coord, Integer largeur, 
			Integer hauteur, Color font, Color ecriture) {
		super(nom, coord, 1);
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.action = action;
		this.font = font;
		this.ecriture = ecriture;
		GestionnaireEvenement.addElemPresent(this);
	}

	@Override
	public void affiche() {
		Affichages.bouton(this.getNom(), this.getCoord(), largeur, hauteur, font, ecriture);
	}
	
	@Override
	public void verificationEvenement() {
		if (GestionnaireClavierSouris.clickSimple) {
			if (clic(new Coordonnees(Mouse.getX(), (Display.getHeight() - Mouse.getY())))) {
				GestionnaireEvenement.getEvenements().push(new ClicBouton(this));
			}
		}
		
	}

	public Boolean clic(Coordonnees coordClic) {
		Float xClic = coordClic.getX();
		Float yClic = coordClic.getY();
		Float xBouton = this.getCoord().getX();
		Float yBouton = this.getCoord().getY();
		if (xBouton < xClic && (xBouton + largeur) > xClic && yBouton < yClic
				&& (yBouton + hauteur) > yClic)
			return true;
		return false;
	}

	public void actionAssocier() {
		action.action();
	}
}
