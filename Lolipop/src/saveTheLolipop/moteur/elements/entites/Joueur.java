package saveTheLolipop.moteur.elements.entites;

import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireClavierSouris;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.ConfigurationClavierSouris;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.boucleAffichage.GestionnaireAffichage;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.DeplacementAffichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public final class Joueur extends Actifs{
	
	private Integer PEx;
	private Integer DEF;
	private Integer PM;
	private Boolean moving;
	private ConfigurationClavierSouris conf;

	public Joueur() {
		super();
		this.PM = 100;
		this.DEF = 0;
		this.PEx = 0;
		this.moving = false;
		this.conf = new ConfigurationClavierSouris();
		ajoutListeElems();
	}
	
	public Joueur(String nom, EnumType type) {
		super(nom, type, 1);
		this.PM = 100;
		this.DEF = 0;
		this.PEx = 0;
		this.moving = false;
		this.conf = new ConfigurationClavierSouris();
		ajoutListeElems();
	}
	
	public Joueur(String nom, Coordonnees coord, EnumType type, Integer PV, Integer PM, Integer ATT, Float Vit, Integer DEF, Integer PEx) {
		super(nom, coord, type, PV, ATT, Vit, 1);
		this.PM = PM;
		this.DEF = DEF;
		this.PEx = PEx;
		this.moving = false;
		this.conf = new ConfigurationClavierSouris();
		ajoutListeElems();
	}
	
	public void affiche() {
		if (!this.t) {
			UtilitaireAffichage.spawnMiddle(this);
			t = true;
		}
		moving = GestionnaireClavierSouris.enMouvementHaut || GestionnaireClavierSouris.enMouvementBas 
			|| GestionnaireClavierSouris.enMouvementDroit || GestionnaireClavierSouris.enMouvementGauche;
		if (moving) {
			Affichages.animationMarche(this.getType().code(), this.getCoord());
		} else {
			Affichages.Immobile(this.getType().code(), this.getCoord());
		}
	}
	
	public void deplacement(int delta) {
		DeplacementAffichages.deplacementSimple(this.getCoord(), this.getVitesse(), delta);
	}
	
	public void attaquer() {
		//TODO appel animation + evenement
	}
	
	//fonction private
	private void ajoutListeElems() {
		this.ajoutElementAffiche();//GestionnaireAffichage.addElemPresent(this, this.getProfondeur());
		this.ajoutElementEvenement();//GestionnaireEvenement.addElemPresent(this);
	}
	//////////////////////////////
	// 		getteur-setteur		//
	//////////////////////////////
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

	@Override
	public void verificationEvenement() {
		// TODO Auto-generated method stub
		
	}
}
