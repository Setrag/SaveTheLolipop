package saveTheLolipop.moteur.utilitaire;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class ConfigurationClavierSouris {
	private int moveUp;
	private int moveDown;
	private int moveLeft;
	private int moveRight;
	private int attaqueBase;
	private int lancementSort;
	private int menu;

	public ConfigurationClavierSouris() {
		this.moveUp = Keyboard.KEY_Z;
		this.moveDown = Keyboard.KEY_S;
		this.moveLeft = Keyboard.KEY_Q;
		this.moveRight = Keyboard.KEY_D;
		this.menu = Keyboard.KEY_E;
		this.attaqueBase = Mouse.getButtonIndex(Mouse.getButtonName(0));
		this.lancementSort = Mouse.getButtonIndex(Mouse.getButtonName(1));
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public int getMoveUp() {
		return moveUp;
	}

	public void setMoveUp(int moveUp) {
		this.moveUp = moveUp;
	}

	public int getMoveDown() {
		return moveDown;
	}

	public void setMoveDown(int moveDown) {
		this.moveDown = moveDown;
	}

	public int getMoveLeft() {
		return moveLeft;
	}

	public void setMoveLeft(int moveLeft) {
		this.moveLeft = moveLeft;
	}

	public int getMoveRight() {
		return moveRight;
	}

	public void setMoveRight(int moveRight) {
		this.moveRight = moveRight;
	}

	public int getAttaqueBase() {
		return attaqueBase;
	}

	public void setAttaqueBase(int attaqueBase) {
		this.attaqueBase = attaqueBase;
	}

	public int getLancementSort() {
		return lancementSort;
	}

	public void setLancementSort(int lancementSort) {
		this.lancementSort = lancementSort;
	}
}
