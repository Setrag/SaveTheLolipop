package saveTheLolipop.moteur.gestionnaireEtats;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique.FabriqueEtat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteurGraphique.boucleAffichage.GestionnaireAffichage;

public class GestionnaireEtat {
	private static EnumEtat etatCourant = EnumEtat.MENU;
	private static boolean changementEtat = true;
	private static Etat etat;

	public static void verificateurEtat() {
		if (changementEtat) {
			etat = FabriqueEtat.getFabrique(etatCourant).creerEtat();
			changementEtat = false;
		}
		etat.fonctionnementEtat();
	}

	public static void setEtatCourant(EnumEtat etat) {
		etatCourant = etat;
		GestionnaireEvenement.delTousElemPresent();
		GestionnaireAffichage.delTousElemPresent();
		GestionnaireClavierSouris.reset();
		changementEtat = true;
	}

}
