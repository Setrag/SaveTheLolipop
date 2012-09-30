package saveTheLolipop;

//import saveTheLolipop.moteur.Elements;
//import saveTheLolipop.moteur.Joueur;
import static saveTheLolipop.utilitaire.Fps.*;
import saveTheLolipop.moteur.Moteur;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteurGraphique.MoteurGraphique;
import saveTheLolipop.utilitaire.Fps;

public class Main {
	/**
	 * @param args
	 */
	public static String configPath = "";

	public static void main(String[] args) {
		if (args.length != 0) {
			String str = args[0];
			for (int i = 1; i < args.length; i++) {
				str += " " + args[i];
			}
			configPath = str;
			System.out.println(configPath);
		}
		boolean arretDuJeu = false;
		int delta;
		MoteurGraphique moteurGraphique = new MoteurGraphique();
		Moteur moteur = new Moteur();

		moteur.init();
		moteurGraphique.init();
		delta = getDelta();
		lastFPS = getTime();
		while (!arretDuJeu) {
			delta = Fps.getDelta();
			moteur.frame(delta);
			moteurGraphique.frame(delta);
			arretDuJeu = GestionnaireEvenement.estArret();
			updateFPS();
		}
		System.out.println("jeu terminer correctement");
	}
}
