package saveTheLolipop.moteur.gestionnaireEtats.etats;

import saveTheLolipop.moteur.elements.carte.Carte;
import saveTheLolipop.moteur.elements.menus.MenuDroite;

public class EtatEditeurCarte extends Etat {
	public EtatEditeurCarte() {
		System.out.println("etat editeur de carte");
		new MenuDroite("inventaire");
		new Carte();
	}
	
	@Override
	public void fonctionnementEtat() {
		// TODO Auto-generated method stub
	}

}
