package saveTheLolipop.moteur.elements.entites;


import org.newdawn.slick.Image;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.ImageChargeur;

public abstract class ElementsJeu extends Elements{
	//attributes
	private EnumType type;
	
	//constructeur ?
	public ElementsJeu() {
		super();
		this.type = EnumType.GUERRIER;
	}
	
	public ElementsJeu(String nom, EnumType type, Integer profondeur) {
		super(nom, profondeur);
		this.type = type;
	}
	
	public ElementsJeu(String nom, Coordonnees coord, EnumType type, Integer profondeur) {
		super(nom, coord, profondeur);
		this.type = type;
	}
	//fonction
	public void affiche() {
		Image texture = ImageChargeur.getImage(type.code());
		if (texture == null) {
			texture = ImageChargeur.getImage(90);
		}
		Affichages.afficheImage(texture, this.getCoord());
	}

	public abstract void deplacement(int delta);
 	
	//////////////////////////////
	// 		getteur-setteur		//
	//////////////////////////////
	public EnumType getType() {
		return type;
	}

	public void setType(EnumType type) {
		this.type = type;
	}


}
