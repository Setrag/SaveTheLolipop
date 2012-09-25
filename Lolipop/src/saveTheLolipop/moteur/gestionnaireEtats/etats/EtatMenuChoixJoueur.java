package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.menus.Menu;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.*;

public class EtatMenuChoixJoueur extends Etat {
	public EtatMenuChoixJoueur() {
		System.out.println("etat choix joueur");
		String[] boutons = { "Guerrier", "Mage", "Archer" };
		ActionBouton[] actions = { new NouveauJeuG(), new NouveauJeuM(),
				new NouveauJeuA() };
		new Menu("Save the LoliPop", boutons, actions);
	}

	@Override
	public void fonctionnementEtat() {
		// TODO Auto-generated method stub
	}

}
