package saveTheLolipop.utilitaire;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import saveTheLolipop.moteur.elements.Elements;

public class ChargementSauvegarde {
	public static Map<Integer, String> parseData(String pathToDataFile) {
		Scanner scanner = null;
		Map<Integer, String> res = new HashMap<Integer, String>();
		try {
			scanner = new Scanner(new FileInputStream(pathToDataFile), "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while (scanner.hasNextLine()) {
				// ici le fichier est lu ligne par ligne
				String line = scanner.nextLine();
				if (!line.startsWith("//")) {
					String[] params = line.split(" ");
					res.put(Integer.valueOf(params[0]), params[1]);
				}
			}
		} finally {
			scanner.close();
		}
		return res;
	}

	public static Elements deSerializer(String fichierSer) {
		try {
			FileInputStream fichier = new FileInputStream(fichierSer);
			ObjectInputStream ois = new ObjectInputStream(fichier);
			return (Elements) ois.readObject();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void serializer(String fichierSer, Elements elem) {
		try {
			FileOutputStream fichier = new FileOutputStream(fichierSer + ".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(elem);
			oos.flush();
			oos.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}
