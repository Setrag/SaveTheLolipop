package saveTheLolipop.moteur.elements.entités;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.utilitaire.ConfigurationClavierSouris;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.DeplacementAffichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public final class Joueur extends Actifs {

	private Integer PEx;
	private Integer DEF;
	private Integer PM;
	private ConfigurationClavierSouris conf;

	public Joueur() {
		super();
		this.PM = 100;
		this.DEF = 0;
		this.PEx = 0;
		this.conf = new ConfigurationClavierSouris();
	}

	public Joueur(String nom, EnumType type) {
		super(nom, type);
		this.PM = 100;
		this.DEF = 0;
		this.PEx = 0;
		this.conf = new ConfigurationClavierSouris();
		this.ajoutElement();
	}

	public Joueur(String nom, Coordonnees coord, EnumType type, Integer PV,
			Integer PM, Integer ATT, Float Vit, Integer DEF, Integer PEx) {
		super(nom, coord, type, PV, ATT, Vit);
		this.PM = PM;
		this.DEF = DEF;
		this.PEx = PEx;
		this.conf = new ConfigurationClavierSouris();
	}

	public void affiche() {
		if (!this.t) {
			UtilitaireAffichage.spawnMiddle(this);
			t = true;
		}
		moving = GestionnaireClavierSouris.enMouvementHaut
				|| GestionnaireClavierSouris.enMouvementBas
				|| GestionnaireClavierSouris.enMouvementDroit
				|| GestionnaireClavierSouris.enMouvementGauche;
		super.affiche();
	}

	public void deplacement(int delta) {
		DeplacementAffichages.deplacementSimple(this.getCoord(), this.getVitesse(), delta);
	}

	public void attaquer() {
		// TODO appel animation + evenement
	}


	// ////////////////////////////
	// getteur-setteur //
	// ////////////////////////////
	public Integer getPEx() {
		return PEx;
	}

	public void setPEx(Integer pEx) {
		PEx = pEx;
	}

	public Integer getDEF() {
		return DEF;
	}

	public void setDEF(Integer dEF) {
		DEF = dEF;
	}

	public Integer getPM() {
		return PM;
	}

	public void setPM(Integer pM) {
		PM = pM;
	}

	public ConfigurationClavierSouris getConf() {
		return conf;
	}
}
