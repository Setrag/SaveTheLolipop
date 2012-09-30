package saveTheLolipop.moteurGraphique.boucleAffichage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public class Afficheur {
	// attributes
	private static Map<Integer, Set<Elements>> elemPresent = new HashMap<Integer, Set<Elements>>();

	// fonctions
	public static void affichageInitial() {
		initListeElemPresent();
		//UtilitaireAffichage.displayModeList();
	}

	public static void affichageImage() {
		for (int i = 0; i < elemPresent.size(); i ++) {
			Set<Elements> elemsPresentHauteur = elemPresent.get(i);
			System.out.println("element a afficher " + elemPresent.get(i).size() + " pour la profondeur " + i);
			for (Elements e : elemsPresentHauteur) {
				e.affiche();
				//System.out.println(e.getNom());
			}
		}
	}

	public static void deplacementImage(int delta) {
		for (int i = 0; i < elemPresent.size(); i ++) {
			Set<Elements> elemsPresentHauteur = elemPresent.get(i);
			for (Elements e : elemsPresentHauteur) {
				e.deplacement(delta);
			}
		}
	}

	public static void optionAffichage() {
		UtilitaireAffichage.pleineEcran();
	}

	public static void addElemPresent(Elements e, Integer profondeur) {
		elemPresent.get(profondeur).add(e);
	}

	public static void delElemPresent(Elements e, Integer profondeur) {
		elemPresent.get(profondeur).remove(e);
	}

	public static void delTousElemPresent() {
		elemPresent.clear();
		initListeElemPresent();
	}

	private static void initListeElemPresent() {
		elemPresent.put(0, new HashSet<Elements>());
		elemPresent.put(1, new HashSet<Elements>());
		elemPresent.put(2, new HashSet<Elements>());
	}

}
