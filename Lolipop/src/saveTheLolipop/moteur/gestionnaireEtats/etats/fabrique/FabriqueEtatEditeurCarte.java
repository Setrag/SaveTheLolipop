package saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.etats.EtatEditeurCarte;

public class FabriqueEtatEditeurCarte extends FabriqueEtat {

	@Override
	public Etat creerEtat() {
		return (new EtatEditeurCarte());
	}

}
