package saveTheLolipop.moteur.gestionnaireEtats.etats.fabrique;

import saveTheLolipop.moteur.gestionnaireEtats.etats.Etat;
import saveTheLolipop.moteur.gestionnaireEtats.utilitaire.EnumEtat;

public abstract class FabriqueEtat {

	public static FabriqueEtat getFabrique(EnumEtat etat) {
		switch (etat) {
		case MENU:
			return (new FabriqueEtatMenuPrincipale());
		case JEU:
			return (new FabriqueEtatJeu());
		case CHOIXJOUEUR:
			return (new FabriqueEtatMenuChoixJoueur());
		case EDITEUR:
			return (new FabriqueEtatEditeurCarte());
		default:
			return null;
		}
	}

	public abstract Etat creerEtat();
}
