package saveTheLolipop.moteur.gestionnaireEvenements;

import java.util.HashSet;
import java.util.LinkedList;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.elements.menus.Bouton;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.Evenement;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.ClicBouton;
import saveTheLolipop.moteur.utilitaire.Coordonnees;

public class GestionnaireEvenement {
	public static boolean arretJeu;
	private static LinkedList<Evenement> evenements = new LinkedList<Evenement>();;
	private static HashSet<Elements> elems = new HashSet<Elements>();

	public static void gestionEvenement() {
		while (!evenements.isEmpty()) {
			evenements.pop().gestionEvenement();
		}
	}

	public static void declancheurEvenement() {
		// TODO a modifier ca me plais pas
		if (GestionnaireClavierSouris.clickSimple) {
			for (Elements e : elems) {
				if (e instanceof Bouton) {
					if (((Bouton) e).clic(new Coordonnees(Mouse.getX(),
							(Display.getHeight() - Mouse.getY())))) {
						evenements.push(new ClicBouton((Bouton) e));
					}
				}
			}
		}
	}

	public static boolean estArret() {
		if (Display.isCloseRequested() || arretJeu) {
			Display.destroy();
			return true;
		}
		return false;
	}

	public static void empileEvenement(Evenement e) {
		evenements.push(e);
	}

	public static void addElemPresent(Elements e) {
		elems.add(e);
	}

	public static void delElemPresent(Elements e) {
		elems.remove(e);
	}

	public static void delTousElemPresent() {
		elems.clear();
	}
	
	public static void setArretJeu(boolean arretJeu) {
		GestionnaireEvenement.arretJeu = arretJeu;
	}
}
