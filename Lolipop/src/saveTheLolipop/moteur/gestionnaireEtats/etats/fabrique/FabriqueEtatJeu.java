package saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.etats.EtatJeu;

public class FabriqueEtatJeu extends FabriqueEtat {
	@Override
	public Etat creerEtat() {
		return (new EtatJeu());
	}
}
