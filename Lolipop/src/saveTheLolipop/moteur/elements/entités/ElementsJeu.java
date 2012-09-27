package saveTheLolipop.moteur.elements.entit�s;

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
