package saveTheLolipop.moteurGraphique;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;
//import saveTheLolipop.moteurGraphique.afficheurs.Utilitaire;
import static org.lwjgl.opengl.GL11.*;

public class MoteurGraphique {
	// attributes
	private int HAUTEUR = 720;
	private int LARGEUR = 1280;

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
		// init affichage OpenGl
		initGL();
		Afficheur.affichageInitial();
		// Utilitaire.displayModeList();
	}

	public void frame(int delta) {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		// debut affichage OpenGl
		Afficheur.affichageImage();
		Afficheur.deplacementImage(delta);
		Afficheur.optionAffichage();
		// fin affichage OpenGl
		Display.update();
		//Display.sync(60);
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
