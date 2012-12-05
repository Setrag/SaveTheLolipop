package saveTheLolipop.moteur.elements.menus;


import java.util.HashSet;
import java.util.Set;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.FinJeu;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.Sauvegarde;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;
import saveTheLolipop.moteurGraphique.donneesAffichage.DeplacementAffichages;

public class MenuDroite extends Elements {
	private Float largeur;
	private Set<MenuContenu> contenu = new HashSet<MenuContenu>();
	private Bouton quitter;
	private Bouton save;

	public MenuDroite(String nom, Elements e) {
		super(nom, new Coordonnees(Display.getWidth() - 144, 0), 1);
		this.largeur = 144f;
		save = new Bouton("Sauvegarder", new Sauvegarde(e.getNom(), e), 
				new Coordonnees(Display.getWidth() , Display.getHeight() - 60), 124, 20,
				Color.lightGray, Color.white);
		quitter = new Bouton("Quitter", new FinJeu(), 
				new Coordonnees(Display.getWidth(), Display.getHeight() - 30), 124, 20,
				Color.lightGray, Color.white);
		ajoutElementAffiche();
		ajoutElementEvenement();
	}
	
	public MenuDroite(String nom, Set<MenuContenu> contenu, Elements e) {
		super(nom, new Coordonnees(Display.getWidth() - 144, 0), 1);
		this.largeur = 144f;
		this.contenu = contenu;
		save = new Bouton("Sauvegarder", new Sauvegarde(e.getNom(), e), 
				new Coordonnees(Display.getWidth() , Display.getHeight() - 60), 124, 20,
				Color.lightGray, Color.white);
		quitter = new Bouton("Quitter", new FinJeu(), 
				new Coordonnees(Display.getWidth(), Display.getHeight() - 30), 124, 20,
				Color.lightGray, Color.white);
		ajoutElementAffiche();
		ajoutElementEvenement();
	}

	@Override
	public void affiche() {
		Affichages.menuDroite(this.getCoord(), this.largeur);
		Affichages.afficheString(this.getNom(), new Coordonnees(this.getCoord()
				.getX() + (largeur / 2) - (this.getNom().length() * 5), 10f), Color.white);
		for(MenuContenu m: contenu) {
			m.affiche();
		}
		quitter.affiche();
		save.affiche();
		
		
	}

	@Override
	public void verificationEvenement() {
		DeplacementAffichages.apparitionDroite(this.getCoord(), this.largeur);
		DeplacementAffichages.apparitionDroite(save.getCoord(), this.largeur - 10);
		DeplacementAffichages.apparitionDroite(quitter.getCoord(), this.largeur - 10);
	}

}
