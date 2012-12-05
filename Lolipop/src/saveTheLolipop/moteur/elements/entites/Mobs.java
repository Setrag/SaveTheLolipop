package saveTheLolipop.moteur.elements.entites;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.DeplacementAffichages;

public class Mobs extends Actifs{
	public Mobs(String nom, Coordonnees coord, EnumType type, Integer PV, Integer ATT, Float Vit) {
		super(nom, coord, type, PV, ATT, Vit, 1);
	}
	
	public void deplacement(int delta) {
		DeplacementAffichages.deplacementSimple(this.getCoord(), this.getVitesse(), delta);
	}
	public void attaquer() {
		//TODO appel animation + evenement
	}

	@Override
	public void verificationEvenement() {
		// TODO Auto-generated method stub
		
	}
}
