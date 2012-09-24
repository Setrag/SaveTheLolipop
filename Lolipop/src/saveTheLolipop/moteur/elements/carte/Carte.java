package saveTheLolipop.moteur.elements.carte;

import java.util.Map;

import saveTheLolipop.Main;
import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.elements.entit�s.CaseQuadrillage;
import saveTheLolipop.moteur.gestionnaireEvenements.GestionnaireEvenement;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.boucleAffichage.Afficheur;
import saveTheLolipop.utilitaire.ChargementSauvegarde;

public class Carte extends Elements{
	private CaseQuadrillage[][] matricecarte;
	private Coordonnees coord;
	
	public Carte() {
		matricecarte = new CaseQuadrillage[100][100];
		Float x = 0f;
		Float y = 0f;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				matricecarte[i][j] = new CaseQuadrillage(new Coordonnees(x, y));
				x += 25;
			}
			y += 25;
			x = 0f;
		}
		this.coord = new Coordonnees();
	}
	public Carte(int codeCarte) {
		chargeurCarte(codeCarte);
	}
	
	@Override
	public void affiche() {
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				matricecarte[i][j].affiche();
			}
		}
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
		Map<Integer, String> pathCarte = ChargementSauvegarde.parseData(Main.configPath + "./config/carteData.txt");
		return (Carte) ChargementSauvegarde.deSerializer(pathCarte.get(codeCarte));
	}
	public CaseQuadrillage[][] getMatriceDecor() {
		return matricecarte;
	}
	public void setMatriceDecor(Integer x, Integer y, CaseQuadrillage decors) {
		this.matricecarte[x][y] = decors;
	}
	
}
