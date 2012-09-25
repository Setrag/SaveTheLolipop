package saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.etats.EtatMenuPrincipale;

public class FabriqueEtatMenuPrincipale extends FabriqueEtat {
	@Override
	public Etat creerEtat() {
		return (new EtatMenuPrincipale());
	}
}
