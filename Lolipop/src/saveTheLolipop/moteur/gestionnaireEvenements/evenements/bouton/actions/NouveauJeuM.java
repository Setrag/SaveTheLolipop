package saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions;

import saveTheLolipop.moteur.elements.entités.Joueur;
import saveTheLolipop.moteur.gestionnaireEtats.GestionnaireEtat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;
import saveTheLolipop.moteur.utilitaire.EnumType;

public class NouveauJeuM implements ActionBouton {

	@Override
	public void action() {
		GestionnaireEtat.setEtatCourant(EnumEtat.JEU);
		new Joueur("laurent", EnumType.MAGE);

	}

}
