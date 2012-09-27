package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.menus.Menu;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.ActionBouton;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.AuMenuChoix;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.FinJeu;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.NouveauEditeurCarte;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.NouveauJeu;

public class EtatMenuPrincipale extends Etat {
	public EtatMenuPrincipale() {
		System.out.println("etat menu");
		String[] boutons = { "jeu", "choix personnage", "editeur de carte", "Quitter" };
		ActionBouton[] actions = { new NouveauJeu(), new AuMenuChoix(),
				new NouveauEditeurCarte(), new FinJeu() };
		new Menu("Save the LoliPop", boutons, actions);
	}

	@Override
	public void fonctionnementEtat() {

	}
}
