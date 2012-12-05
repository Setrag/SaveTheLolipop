package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.menus.MenuPrincipale;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.ActionBouton;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.AuMenuChoix;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.FinJeu;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.NouveauEditeurCarte;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.NouveauJeu;

public class EtatMenuPrincipale extends Etat {
	private String titre;
	private MenuPrincipale m;
	
	public EtatMenuPrincipale() {
		System.out.println("etat menu");
		titre = "Save The Lolipop";
		String[] boutons = { "jeu", "choix personnage", "editeur de carte", "Quitter" };
<<<<<<< HEAD
		ActionBouton[] actions = { new NouveauJeu(), new AuMenuChoix(),	new NouveauEditeurCarte(), new FinJeu() };
		m = new MenuPrincipale(titre, boutons, actions);
=======
		ActionBouton[] actions = { new NouveauJeu(), new AuMenuChoix(),
				new NouveauEditeurCarte(), new FinJeu() };
		new Menu("Save the LoliPop", boutons, actions);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
	}

	@Override
	public void fonctionnementEtat() {
		
	}
}
