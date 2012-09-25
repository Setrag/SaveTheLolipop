package saveTheLolipop.moteur.utilitaire;

import saveTheLolipop.utilitaire.EnumDirection;

public class Coordonnees {
	private Float x;
	private Float y;

	public Coordonnees() {
		this.x = 0f;
		this.y = 0f;
	}

	public Coordonnees(Integer x, Integer y) {
		this.x = x.floatValue();
		this.y = y.floatValue();
	}

	public Coordonnees(Float x, Float y) {
		this.x = x;
		this.y = y;
	}

	public EnumDirection comparePosition(Coordonnees coord) {
		// return la direction relative du paramètre par rapport a l'objet
		// coordonnee
		Float x = coord.getX();
		Float y = coord.getY();

		// y < C*x - C*a + b
		// y - C*x < + b - C*a

		if (y + 0.5f * x < this.y + 0.5f * this.x) {
			if (y - 2 * x < this.y - 2 * this.x) {
				if (y + 2 * x < this.y + 2 * this.x) {
					return EnumDirection.UP;
				} else {
					return EnumDirection.UPRIGHT;
				}
			} else {
				if (y - 0.5f * x < this.y - 0.5f * this.x) {
					return EnumDirection.UPLEFT;
				} else {
					return EnumDirection.LEFT;
				}
			}
		} else {
			if (y - 2 * x > this.y - 2 * this.x) {
				if (y + 2 * x > this.y + 2 * this.x) {
					return EnumDirection.DOWN;
				} else {
					return EnumDirection.DOWNLEFT;
				}
			} else {
				if (y - 0.5f * x > this.y - 0.5f * this.x) {
					return EnumDirection.DOWNRIGHT;
				} else {
					return EnumDirection.RIGHT;
				}
			}
		}
	}

	public Float distance(Coordonnees coord) {
		Float x = coord.getX();
		Float y = coord.getY();

		return (float) Math.sqrt(Math.pow((x - this.x), 2)
				+ Math.pow((y - this.y), 2));
	}

	public void vauxLaValeur(Coordonnees coord) {
		this.x = coord.getX();
		this.y = coord.getY();
	}

	public Float getX() {
		return x;
	}

	public void setX(Float x) {
		this.x = x;
	}

	public Float getY() {
		return y;
	}

	public void setY(Float y) {
		this.y = y;
	}
}
