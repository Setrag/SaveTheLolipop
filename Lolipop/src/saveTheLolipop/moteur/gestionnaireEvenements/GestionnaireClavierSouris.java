package saveTheLolipop.moteur.gestionnaireEvenements;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import saveTheLolipop.moteur.utilitaire.ConfigurationClavierSouris;

public class GestionnaireClavierSouris {
	//attribut (evenement assosier a l'utilisation du clavier souris)
	public static boolean enMouvementHaut;
	public static boolean enMouvementBas;
	public static boolean enMouvementDroit;
	public static boolean enMouvementGauche;
	public static boolean enAttaque;
	public static boolean enLancementSort;
	public static boolean enPleinEcran;
	public static boolean clickSimple;
	public static boolean enMenu;
	public static boolean echap;
	private static ConfigurationClavierSouris conf = new ConfigurationClavierSouris();
	private static boolean passe;
	
	
	
	
	//gestion des entrer clavier souris
	public static void gestionnaireClavier() {
		while (Keyboard.next()){
			//ici les actions liers aux différente entrée clavierszss
			//verif déplacement
			enMouvementHaut = Keyboard.isKeyDown(conf.getMoveUp());
			enMouvementBas = Keyboard.isKeyDown(conf.getMoveDown());
			enMouvementGauche = Keyboard.isKeyDown(conf.getMoveLeft());
			enMouvementDroit = Keyboard.isKeyDown(conf.getMoveRight());
			echap = Keyboard.isKeyDown(Keyboard.KEY_ESCAPE);
			enMenu = (Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_E) ^ enMenu;
			//switch plein écran
			enPleinEcran = (Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_F) ^ enPleinEcran;
		}
	}
	
	public static void gestionnaireSouris() {
		if(Mouse.isButtonDown(0) && !passe) {
			clickSimple = true;
			passe = true;
		} else if (Mouse.isButtonDown(0) && passe) {
			clickSimple = false;
		} else {
			passe = false;
		}
		enAttaque = Mouse.isButtonDown(conf.getAttaqueBase());
		enLancementSort = Mouse.isButtonDown(conf.getLancementSort());
	}

	public static void setConf(ConfigurationClavierSouris conf) {
		GestionnaireClavierSouris.conf = conf;
	}
	
	public static void reset() {
		enMouvementHaut = false;
		enMouvementBas = false;
		enMouvementDroit = false;
		enMouvementGauche = false;
		enAttaque = false;
		enLancementSort = false;
		enPleinEcran = false;
		clickSimple = false;
		enMenu = false;
	}
	
}
