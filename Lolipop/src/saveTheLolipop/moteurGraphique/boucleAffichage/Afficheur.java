package saveTheLolipop.moteurGraphique.boucleAffichage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.elements.entites.Actifs;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public class Afficheur {
	// attributes
<<<<<<< HEAD
	private static Map<Integer, Set<Elements>> elemPresent = new HashMap<Integer, Set<Elements>>();
	private static Set<Actifs> elemActif = new HashSet<Actifs>();
=======
	private static Set<Elements> elemPresent = new HashSet<Elements>();
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte

	// fonctions
	public static void affichageInitial() {
		//UtilitaireAffichage.displayModeList();
	}

	public static void affichageImage() {
<<<<<<< HEAD
		for (int i = 0; i < elemPresent.size(); i ++) {
			Set<Elements> elemsPresentHauteur = elemPresent.get(i);
			//System.out.println("element a afficher " + elemPresent.get(i).size() + " pour la profondeur " + i);
			for (Elements e : elemsPresentHauteur) {
				e.affiche();
				//System.out.println(e.getNom());
			}
=======
		Iterator<Elements> elems = elemPresent.iterator();
		// System.out.println("element a afficher " + elemPresent.size());
		while (elems.hasNext()) {
			elems.next().affiche();
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
		}
	}

	public static void deplacementImage(int delta) {
<<<<<<< HEAD
		for (Actifs a : elemActif) {
			a.deplacement(delta);
=======
		Iterator<Elements> elems = elemPresent.iterator();
		while (elems.hasNext()) {
			elems.next().deplacement(delta);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
		}
	}

	public static void optionAffichage() {
		UtilitaireAffichage.pleineEcran();
	}

<<<<<<< HEAD
	public static void addElemActif(Actifs a) {
		elemActif.add(a);
	}
	
	public static void delElemActif(Actifs a) {
		elemActif.remove(a);
	}
	
	public static void addElemPresent(Elements e, Integer profondeur) {
		elemPresent.get(profondeur).add(e);
=======
	public static void addElemPresent(Elements e) {
		elemPresent.add(e);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
	}

	public static void delElemPresent(Elements e) {
		elemPresent.remove(e);
	}

	public static void delTousElemPresent() {
		elemPresent.clear();
	}

}
