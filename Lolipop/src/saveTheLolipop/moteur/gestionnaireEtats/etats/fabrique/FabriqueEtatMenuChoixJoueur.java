package saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.etats.EtatMenuChoixJoueur;

public class FabriqueEtatMenuChoixJoueur extends FabriqueEtat {

	@Override
	public Etat creerEtat() {
		return (new EtatMenuChoixJoueur());
	}

}
