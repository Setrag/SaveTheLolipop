package saveTheLolipop.moteur.elements.carte;

import java.util.Map;

import org.lwjgl.opengl.Display;

import saveTheLolipop.Main;
import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.elements.entites.CaseQuadrillage;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.utilitaire.ChargementSauvegarde;

public class Carte extends Elements implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3110602875092335566L;
	private CaseQuadrillage[][] matricecarte;
	//private Coordonnees coord;

	public Carte() {
		super("Carte_test", 1);
		matricecarte = new CaseQuadrillage[(Display.getHeight() / 16) + 1][(Display.getWidth() / 16) + 1];
		Float x = 0f;
		Float y = 0f;
		for (int i = 0; i <= Display.getHeight() / 16; i++) {
			for (int j = 0; j < (Display.getWidth() / 16); j++) {
				matricecarte[i][j] = new CaseQuadrillage(new Coordonnees(x, y));
				x += 16;
			}
			y += 16;
			x = 0f;
		}
		//this.coord = new Coordonnees();
	}

	public Carte(int codeCarte) {
		chargeurCarte(codeCarte);
	}

	@Override
	public void affiche() {
		// affichage des case de decors deja faite
	}

	@Override
	public void verificationEvenement() {
		// TODO Auto-generated method stub
		
	}
	
	private Carte chargeurCarte(int codeCarte) {
		// charge la carte correspondant au code depuis un fichier
		Map<Integer, String> pathCarte = ChargementSauvegarde
				.parseData(Main.configPath + "./config/carteData.txt");
		return (Carte) ChargementSauvegarde.deSerializer(pathCarte
				.get(codeCarte));
	}

	public CaseQuadrillage[][] getMatriceDecor() {
		return matricecarte;
	}

	public void setMatriceDecor(Integer x, Integer y, CaseQuadrillage decors) {
		this.matricecarte[x][y] = decors;
	}

}
