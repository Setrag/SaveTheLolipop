package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.gestionnaireEtats.GestionnaireEtat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;


public class EtatJeu extends Etat{
	public EtatJeu() {
		System.out.println("etat jeu");
	}
	@Override
	public void fonctionnementEtat() {
		if(GestionnaireClavierSouris.echap) GestionnaireEtat.setEtatCourant(EnumEtat.MENU);
	}
}
