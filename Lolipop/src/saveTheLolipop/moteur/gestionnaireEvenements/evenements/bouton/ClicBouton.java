package saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton;

import saveTheLolipop.moteur.elements.menus.Bouton;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.Evenement;

public class ClicBouton extends Evenement {
	private Bouton boutonClic;

	public ClicBouton(Bouton bouton) {
		this.boutonClic = bouton;
	}

	@Override
	public void gestionEvenement() {
		boutonClic.actionAssocier();
		System.out.println("clic sur: " + boutonClic.getNom());
	}

}
