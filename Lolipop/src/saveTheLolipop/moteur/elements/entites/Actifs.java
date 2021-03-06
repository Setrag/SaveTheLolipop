package saveTheLolipop.moteur.elements.entites;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.UtilitaireAffichage;

public abstract class Actifs extends ElementsJeu{
	//attributes
	private Integer PV;
	private Integer ATT;
	private Float Vitesse;
	protected boolean t;
	
	//constructeur ?
	public Actifs() {
		super();
		this.PV = 100;
		this.ATT = 10;
		this.Vitesse = 0.15f;
	}
	public Actifs(String nom, EnumType type, Integer profondeur) {
		super(nom, type, profondeur);
		this.PV = 100;
		this.ATT = 10;
		this.Vitesse = 0.15f;
	}
	public Actifs(String nom, Coordonnees coord, EnumType type, Integer PV, Integer ATT, Float Vitesse, Integer profondeur) {
		super(nom, coord, type, profondeur);
		this.PV = PV;
		this.ATT = ATT;
		this.Vitesse = Vitesse;
	}
	//functions
	public abstract void deplacement(int delta);
	
	public abstract void attaquer();
	
	public void affiche() {
		if (!t) {
			UtilitaireAffichage.spawnMiddle(this);
			t = true;
		}
		Affichages.animationMarche(this.getType().code(), this.getCoord());
	}
	
	//////////////////////////////
	// 		getteur-setteur		//
	//////////////////////////////
	public Integer getPV() {
		return PV;
	}
	public void setPV(Integer pV) {
		PV = pV;
	}
	public Integer getATT() {
		return ATT;
	}
	public void setATT(Integer aTT) {
		ATT = aTT;
	}
	public Float getVitesse() {
		return Vitesse;
	}
	public void setVitesse(Float vitesse) {
		Vitesse = vitesse;
	}
}
