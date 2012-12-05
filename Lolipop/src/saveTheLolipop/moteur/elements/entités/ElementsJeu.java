package saveTheLolipop.moteur.elements.entit�s;


import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.Formes;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.ImageChargeur;

public abstract class ElementsJeu extends Elements{
	//attributes
	private EnumType type;
	
	//constructeur ?
	public ElementsJeu() {
		super();
		this.type = EnumType.GUERRIER;
	}
	
	public ElementsJeu(String nom, EnumType type) {
		super(nom);
		this.type = type;
	}
	
	public ElementsJeu(String nom, Coordonnees coord, EnumType type) {
		super(nom, coord);
		this.type = type;
	}
	//fonction
	public void affiche() {
		Texture texture = ImageChargeur.getTexture(type.code());
		if (texture == null) {
			texture = ImageChargeur.getTexture(90);
		}
		Color.white.bind();
		texture.bind();
		Formes.rectangle(texture.getTextureWidth(), texture.getTextureHeight(),this.getCoord());
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
