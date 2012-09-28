package saveTheLolipop.moteurGraphique;



import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Graphics;

import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import static org.lwjgl.opengl.GL11.*;

public class MoteurGraphique {
	// attributes
	private int HAUTEUR = 600;
	private int LARGEUR = 1024;

	// fonctions
	public MoteurGraphique() {
		try {
			Display.setDisplayMode(new DisplayMode(LARGEUR, HAUTEUR));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void init() {
		Affichages.setG(new Graphics(1, 1));
		// init affichage OpenGl
		initGL();
		Afficheur.affichageInitial();
	}

	public void frame(int delta) {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		// debut affichage OpenGl
		Afficheur.affichageImage();
		Afficheur.deplacementImage(delta);
		Afficheur.optionAffichage();
		// fin affichage OpenGl
		Display.update();
		Display.sync(60);
	}

	private void initGL() {
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, LARGEUR, HAUTEUR, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
	}
}
