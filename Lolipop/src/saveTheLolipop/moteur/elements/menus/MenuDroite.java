package saveTheLolipop.moteur.elements.menus;

import org.lwjgl.opengl.Display;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.DeplacementAffichages;

public class MenuDroite extends Elements {
	private Float largeur;

	public MenuDroite(String nom) {
		super(nom, new Coordonnees(Display.getWidth(), 0));
		this.largeur = 200f;
	}

	@Override
	public void affiche() {
		Affichages.menuDroite(this.getCoord(), this.largeur);
		Affichages.afficheString(this.getNom(), new Coordonnees(this.getCoord()
				.getX() + (largeur / 2) - (this.getNom().length() * 5), 10f));
	}

	@Override
	public void deplacement(int delta) {
		DeplacementAffichages.apparitionDroite(this.getCoord(), this.largeur);
	}

	@Override
	public void ajoutElement() {
		Afficheur.addElemPresent(this);
		GestionnaireEvenement.addElemPresent(this);
	}

	@Override
	public void supElement(Elements e) {
		Afficheur.delElemPresent(this);
		GestionnaireEvenement.delElemPresent(this);
	}

}
