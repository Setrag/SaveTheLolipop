package saveTheLolipop.moteur.elements.menus;

import java.util.HashSet;
import java.util.Set;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import saveTheLolipop.moteur.elements.Elements;
import saveTheLolipop.moteur.gestionnaireEvenements.evenements.bouton.actions.ActionBouton;
import saveTheLolipop.moteur.utilitaire.Coordonnees;
import saveTheLolipop.moteurGraphique.donneesAffichage.Affichages;

public class Menu extends Elements {
	private Set<Bouton> messageBoutons = new HashSet<Bouton>();

	public Menu(String nom) {
		super(nom, new Coordonnees((float) (Display.getWidth() / 2), 10f), 1);
		System.out.println(Display.getWidth() / 2);
		System.out.println(Display.getHeight() / 2);
		//Afficheur.addElemPresent(this);
	}

	public Menu(String nom, String[] boutons, ActionBouton[] actions) {
		super(nom, new Coordonnees((Display.getWidth() / 2f), 10f), 1);
		Float distInterBouton = this.getCoord().getY() + 100;
		Float tiers = (this.getCoord().getX() / 3) * 2;
		for (int i = 0; i < boutons.length; i++) {
			messageBoutons.add(new Bouton(boutons[i], actions[i],
					new Coordonnees(tiers, distInterBouton), (Display
							.getWidth() / 3), 20));
			distInterBouton += 50;
		}
		//Afficheur.addElemPresent(this);
	}

	@Override
	public void affiche() {
		Affichages.afficheString(this.getNom(), new Coordonnees(this.getCoord()
				.getX() - this.getNom().length() * 5, this.getCoord().getY()), Color.white);
		for (Bouton b : messageBoutons) {
			b.affiche();
		}
	}

	@Override
	public void verificationEvenement() {
		// TODO Auto-generated method stub
		
	}
}
