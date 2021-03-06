package saveTheLolipop.moteurGraphique.donneesAffichage.utilitaire;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import saveTheLolipop.Main;
import saveTheLolipop.utilitaire.ChargementSauvegarde;

public class ImageChargeur {

	private static Hashtable<Integer, Image> images = new Hashtable<Integer, Image>();

	public static Image getImage(int code) {
		return images.get(code);
	}

	public static void chargementImages() {
		Map<Integer, String> pathImages = ChargementSauvegarde
				.parseData(Main.configPath + "./config/imageData.txt");
		for (Integer code : pathImages.keySet()) {
			System.out.println(pathImages.get(code));
			try {
				Image tex = chargementFichierImage(Main.configPath
						+ pathImages.get(code));
				images.put(code, tex);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static Image chargementFichierImage(String filePath)
			throws IOException {
		Image img = null;
		try {
			img = new Image(filePath);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
}
