package saveTheLolipop.moteurGraphique.donneesAffichage;

import org.lwjgl.opengl.Display;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.utilitaire.Coordonnees;

public class DeplacementAffichages {
	public static Coordonnees deplacementSimple(Coordonnees coord, Float Vit,
			int delta) {
		Float largeur = (float) Display.getWidth();
		Float hauteur = (float) Display.getHeight();
		Float x = coord.getX();
		Float y = coord.getY();

		if (GestionnaireClavierSouris.enMouvementGauche)
			x -= Vit * delta;
		if (GestionnaireClavierSouris.enMouvementDroit)
			x += Vit * delta;

		if (GestionnaireClavierSouris.enMouvementHaut)
			y -= Vit * delta;
		if (GestionnaireClavierSouris.enMouvementBas)
			y += Vit * delta;

		if (x < 0)
			x = 0f;
		if (x > largeur)
			x = largeur;
		if (y < 0)
			y = 0f;
		if (y > hauteur)
			y = hauteur;

		coord.setX(x);
		coord.setY(y);
		return coord;
	}

	public static void apparitionDroite(Coordonnees coord, Float largeur) {
		if (GestionnaireClavierSouris.enMenu) {
			coord.setX((float) (Display.getWidth() - largeur));
		} else {
			coord.setX((float) Display.getWidth());
		}
	}
}
