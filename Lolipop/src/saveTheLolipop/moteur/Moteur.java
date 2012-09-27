package saveTheLolipop.moteur;

import saveTheLolipop.moteur.gestionnaireEtats.GestionnaireEtat;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.ImageChargeur;

public class Moteur {

	// fonctions
	public Moteur() {
		ImageChargeur.chargementImages();
	}

	public void init() {
		//GestionnaireClavierSouris.enPleinEcran = true;
	}

	public void frame(int delta) {
		// gestion etat / avancement
		GestionnaireEtat.verificateurEtat();
		// gestion evenement contiendra la liste elems
		GestionnaireEvenement.declancheurEvenement();
		GestionnaireEvenement.gestionEvenement();
		// gestion clavier souris
		GestionnaireClavierSouris.gestionnaireClavier();
		GestionnaireClavierSouris.gestionnaireSouris();
	}
}
