package saveTheLolipop.moteur.elements.carte;

import java.util.Map;

import org.lwjgl.opengl.Display;

import saveTheLolipop.Main;
import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.elements.entités.CaseQuadrillage;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;
import saveTheLolipop.utilitaire.ChargementSauvegarde;

public class Carte extends Elements {
	private CaseQuadrillage[][] matricecarte;
	//private Coordonnees coord;

	public Carte() {
		matricecarte = new CaseQuadrillage[(Display.getHeight() / 16) + 1][(Display.getWidth() / 16) - 9];
		Float x = 0f;
		Float y = 0f;
		for (int i = 0; i <= Display.getHeight() / 16; i++) {
			for (int j = 0; j < (Display.getWidth() / 16) - 9; j++) {
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
	public void deplacement(int delta) {
		// TODO Auto-generated method stub
	}

	@Override
	public void ajoutElement() {
		Afficheur.addElemPresent(this);
		GestionnaireEvenement.addElemPresent(this);
	}

	@Override
	public void supElement(Elements e) {
		Afficheur.delElemPresent(this);
		GestionnaireEvenement.delElemPresent(this);
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
