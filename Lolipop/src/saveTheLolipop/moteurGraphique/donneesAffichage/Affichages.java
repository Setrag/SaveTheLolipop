package saveTheLolipop.moteurGraphique.donneesAffichage;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.utilitaire.EnumDirection;
import saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire.ImageChargeur;

public class Affichages {
	private static Graphics g;
	private static Coordonnees lastCoord = new Coordonnees();
	private static Integer codeTextureAnimation = 0;
	private static Integer ancientCodeTextureDirection = 9;

	public static void animationMarche(int codeType, Coordonnees coord) {
		int codeTextureDirection = orientationVision(codeType, coord);

		if (lastCoord.distance(coord) >= 50
				|| codeTextureDirection != ancientCodeTextureDirection) {
			codeTextureAnimation = (int) (codeTextureDirection + ((codeTextureAnimation - codeTextureDirection) % 2)) + 1;
			ancientCodeTextureDirection = codeTextureDirection;
			lastCoord.vauxLaValeur(coord);
		}

		Image image = ImageChargeur.getImage(codeTextureAnimation);
		if (image == null) {
			image = ImageChargeur.getImage(90);
		}
		image.draw(coord.getX(), coord.getY());
	}

	public static void Immobile(int code, Coordonnees coord) {
		int codeTextureDirection = orientationVision(code, coord);
		Image image = ImageChargeur.getImage(codeTextureDirection);
		if (image == null) {
			image = ImageChargeur.getImage(90);
		}
		image.draw(coord.getX(), coord.getY());
	}

	public static void bouton(String messageBouton, Coordonnees coord,
			Integer largeur, Integer hauteur) {
		Float x = coord.getX();
		Float y = coord.getY();

		Color.white.bind();
		g.setColor(Color.gray);
		g.fillRoundRect(x, y, largeur, hauteur, 5);
		g.setColor(Color.white);
		g.drawString(messageBouton, x + (largeur / 2) - messageBouton.length() * 5, y);
	}

	public static void afficheString(String str, Coordonnees coord) {
		g.drawString(str, coord.getX(), coord.getY());
	}

	public static void afficheImage(Image img, Coordonnees coord) {
		img.draw(coord.getX(), coord.getY());
	}
	
	public static void menuDroite(Coordonnees coord, Float largeur) {
		g.setColor(Color.darkGray);
		g.fillRect(coord.getX(), coord.getY(), largeur, Display.getHeight());
		g.resetTransform();
	}
	
	
	//fonction privé
	private static int orientationVision(int codeType, Coordonnees coord) {
		Float sourisCorrectionY = Display.getHeight() - (float) Mouse.getY();
		Coordonnees coordSouris = new Coordonnees((float) Mouse.getX(),
				sourisCorrectionY);
		EnumDirection directionVision = coord.comparePosition(coordSouris);
		int codeAffichage = codeType + 10 * directionVision.code();
		return codeAffichage;
	}
	
	///////////////////////
	// getter / setter   //
	///////////////////////
	
	public static Graphics getG() {
		return g;
	}

	public static void setG(Graphics g) {
		Affichages.g = g;
	}
}
