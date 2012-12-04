package saveTheLolipop.moteur.elements.entités;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;

public class CaseQuadrillage extends ElementsJeu {
	private ElementsJeu elementJeu;

	public CaseQuadrillage(Coordonnees coord) {
		super("herbe", coord, EnumType.HERBE, 0);
	}

	public CaseQuadrillage(String nom, Coordonnees coord, EnumType type) {
		super(nom, coord, type, 0);
	}

	@Override
	public void affiche() {
		super.affiche();
		if (elementJeu != null)
			elementJeu.affiche();
	}
	
	public void testAficher() {
		super.affiche();
	}

	@Override
	public void deplacement(int delta) {
		// pas de déplacement
	}

}
