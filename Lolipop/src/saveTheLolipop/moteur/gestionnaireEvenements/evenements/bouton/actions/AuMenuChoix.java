package saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions;

import saveTheLolipop.moteur.gestionnaireEtats.GestionnaireEtat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;

public class AuMenuChoix implements ActionBouton {

	@Override
	public void action() {
		GestionnaireEtat.setEtatCourant(EnumEtat.CHOIXJOUEUR);
	}

}
