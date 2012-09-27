package saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;

public class FinJeu implements ActionBouton {

	@Override
	public void action() {
		GestionnaireEvenement.setArretJeu(true);
	}

}
