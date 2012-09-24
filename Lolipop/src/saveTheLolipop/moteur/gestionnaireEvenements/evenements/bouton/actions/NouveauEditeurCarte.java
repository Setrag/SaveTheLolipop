package saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions;

import saveTheLolipop.moteur.gestionnaireEtats.GestionnaireEtat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;


public class NouveauEditeurCarte implements ActionBouton {

	@Override
	public void action() {
		GestionnaireEtat.setEtatCourant(EnumEtat.EDITEUR);
	}

}
