package saveTheLolipop.moteur.elements.menus;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.ActionBouton;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;

public class Bouton extends Elements {
	private Integer largeur;
	private Integer hauteur;
	private ActionBouton action;

	public Bouton(String nom, ActionBouton action, Coordonnees coord,
			Integer largeur, Integer hauteur) {
		super(nom, coord, 1);
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.action = action;
	}

	@Override
	public void affiche() {
		Affichages.bouton(this.getNom(), this.getCoord(), largeur, hauteur);
	}

	@Override
	public void deplacement(int delta) {

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
