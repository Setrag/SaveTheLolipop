package saveTheLolipop.moteur.elements.entités;

import org.newdawn.slick.Image;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteur.utilitaire.EnumType;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.ImageChargeur;

public abstract class ElementsJeu extends Elements {
	// attributes
	private EnumType type;

	// constructeur ?
	public ElementsJeu() {
		super();
		super.ajoutElement();
		this.type = EnumType.GUERRIER;
	}

	public ElementsJeu(String nom, EnumType type, Integer profondeurAffichage) {
		super(nom, profondeurAffichage);
		super.ajoutElement();
		this.type = type;
	}

	public ElementsJeu(String nom, Coordonnees coord, EnumType type, Integer profondeurAffichage) {
		super(nom, coord, profondeurAffichage);
		super.ajoutElement();
		this.type = type;
	}

	// fonction
	public void affiche() {
		Image image = ImageChargeur.getImage(type.code());
		if (image == null) {
			image = ImageChargeur.getImage(90);
		}
		Affichages.afficheImage(image, this.getCoord());
	}

	public abstract void deplacement(int delta);

	// ////////////////////////////
	// getteur-setteur //
	// ////////////////////////////
	public EnumType getType() {
		return type;
	}

	public void setType(EnumType type) {
		this.type = type;
	}

}
