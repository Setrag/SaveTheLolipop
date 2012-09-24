package saveTheLolipop.moteur.utilitaire;


public enum EnumType {
	GUERRIER	(100), 
	ARCHER		(200),
	MAGE		(300),
	HERBE		(1);
	//ARBRE		(12,12,4))
	
	private int code;
	
	private EnumType(int c) {
		code = c;
	}

	public int code() {
		return code;
	}	
}
