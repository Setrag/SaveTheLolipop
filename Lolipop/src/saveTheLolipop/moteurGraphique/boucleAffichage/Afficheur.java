package saveTheLolipop.moteurGraphique.boucleAffichage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public class Afficheur {
	// attributes
	private static Set<Elements> elemPresent = new HashSet<Elements>();

	// fonctions
	public static void affichageInitial() {
		//UtilitaireAffichage.displayModeList();
	}

	public static void affichageImage() {
		Iterator<Elements> elems = elemPresent.iterator();
		// System.out.println("element a afficher " + elemPresent.size());
		while (elems.hasNext()) {
			elems.next().affiche();
		}
	}

	public static void deplacementImage(int delta) {
		Iterator<Elements> elems = elemPresent.iterator();
		while (elems.hasNext()) {
			elems.next().deplacement(delta);
		}
	}

	public static void optionAffichage() {
		UtilitaireAffichage.pleineEcran();
	}

	public static void addElemPresent(Elements e) {
		elemPresent.add(e);
	}

	public static void delElemPresent(Elements e) {
		elemPresent.remove(e);
	}

	public static void delTousElemPresent() {
		elemPresent.clear();
	}

}
