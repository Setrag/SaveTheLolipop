package saveTheLolipop.moteur.elements.menus;


import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
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
				.getX() + (largeur / 2) - (this.getNom().length() * 5), 10f), Color.white);
	}

	@Override
	public void deplacement(int delta) {
		DeplacementAffichages.apparitionDroite(this.getCoord(), this.largeur);
	}

}
