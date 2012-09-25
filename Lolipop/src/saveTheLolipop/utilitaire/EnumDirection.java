package saveTheLolipop.utilitaire;

public enum EnumDirection {
	UP(1), DOWN(2), LEFT(3), RIGHT(4), UPLEFT(5), UPRIGHT(6), DOWNLEFT(7), DOWNRIGHT(
			8);

	private int code;

	private EnumDirection(int c) {
		code = c;
	}

	public int code() {
		return code;
	}
}
