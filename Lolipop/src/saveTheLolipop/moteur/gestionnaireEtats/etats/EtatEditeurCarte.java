package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.carte.Carte;
import saveTheLolipop.moteur.elements.menus.MenuDroite;

public class EtatEditeurCarte extends Etat {
	Carte c;
	public EtatEditeurCarte() {
		System.out.println("etat editeur de carte");
		c = new Carte();
		new MenuDroite("inventaire",c);
		
	}

	@Override
	public void fonctionnementEtat() {
		// TODO Auto-generated method stub
	}

}
