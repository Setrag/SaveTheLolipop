package saveTheLolipop.moteur.elements.entit�s;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.Animations;

public class Mobs extends Actifs{
	public Mobs(String nom, Coordonnees coord, EnumType type, Integer PV, Integer ATT, Float Vit) {
		super(nom, coord, type, PV, ATT, Vit);
	}
	
	public void deplacement(int delta) {
		Animations.deplacementSimple(this.getCoord(), this.getVitesse(), delta);
	}
	public void attaquer() {
		//TODO appel animation + evenement
	}
}
