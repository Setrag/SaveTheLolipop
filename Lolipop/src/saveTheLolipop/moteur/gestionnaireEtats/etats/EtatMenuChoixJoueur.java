package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.menus.MenuPrincipale;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.*;

public class EtatMenuChoixJoueur extends Etat {
	public EtatMenuChoixJoueur() {
		System.out.println("etat choix joueur");
		String[] boutons = { "Guerrier", "Mage", "Archer" };
<<<<<<< HEAD
		ActionBouton[] actions = { new NouveauJeuG(), new NouveauJeuM(), new NouveauJeuA() };
		new MenuPrincipale("Save the LoliPop", boutons, actions);
=======
		ActionBouton[] actions = { new NouveauJeuG(), new NouveauJeuM(),
				new NouveauJeuA() };
		new Menu("Save the LoliPop", boutons, actions);
>>>>>>> parent of d6646b8... ajout de la profondeur d'affichage: correction de l'erreur sur l'affiche de la carte
	}

	@Override
	public void fonctionnementEtat() {
		// TODO Auto-generated method stub
	}

}
