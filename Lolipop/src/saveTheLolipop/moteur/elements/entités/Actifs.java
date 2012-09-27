package saveTheLolipop.moteur.elements.entités;

import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;

public abstract class Actifs extends ElementsJeu {
	// attributes
	private Integer PV;
	private Integer ATT;
	private Float Vitesse;
	protected Boolean moving;
	protected boolean t;

	// constructeur ?
	public Actifs() {
		super();
		this.PV = 100;
		this.ATT = 10;
		this.Vitesse = 0.15f;
		this.moving = false;
	}

	public Actifs(String nom, EnumType type) {
		super(nom, type);
		this.PV = 100;
		this.ATT = 10;
		this.Vitesse = 0.15f;
		this.moving = false;
	}

	public Actifs(String nom, Coordonnees coord, EnumType type, Integer PV,
			Integer ATT, Float Vitesse) {
		super(nom, coord, type);
		this.PV = PV;
		this.ATT = ATT;
		this.Vitesse = Vitesse;
		this.moving = false;
	}

	// functions
	public abstract void deplacement(int delta);

	public abstract void attaquer();

	public void affiche() {
		if (moving) {
			Affichages.animationMarche(this.getType().code(), this.getCoord());
		} else {
			Affichages.Immobile(this.getType().code(), this.getCoord());
		}
	}

	// ////////////////////////////
	// getteur-setteur //
	// ////////////////////////////
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
