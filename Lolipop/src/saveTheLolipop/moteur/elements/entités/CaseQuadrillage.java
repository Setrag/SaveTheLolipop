package saveTheLolipop.moteur.elements.entités;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;

public class CaseQuadrillage extends ElementsJeu {
	private ElementsJeu elementJeu;

	public CaseQuadrillage(Coordonnees coord) {
		super("herbe", coord, EnumType.HERBE);
	}

	public CaseQuadrillage(String nom, Coordonnees coord, EnumType type) {
		super(nom, coord, type);
	}

	@Override
	public void affiche() {
		super.affiche();
		if (elementJeu != null)
			elementJeu.affiche();
	}

	@Override
	public void deplacement(int delta) {
		// pas de déplacement
	}

}
