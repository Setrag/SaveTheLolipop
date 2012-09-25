package saveTheLolipop.utilitaire;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;

public final class Fps {
	// attributes
	private static long lastFrame;
	private static int fps;
	public static long lastFPS;

	// calcule le temps delta entre les frames (sert à avoir une plus grande
	// fluidité, meme si le fps diminue)
	public static int getDelta() {
		long time = getTime();
		int delta = (int) (time - lastFrame);
		lastFrame = time;
		return delta;
	}

	public static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}

	// calcule le Fps en comptant le nb de fois que cette method est appellée
	// par seconds
	public static void updateFPS() {
		if (getTime() - lastFPS > 1000) {
			Display.setTitle("FPS: " + fps);
			fps = 0;
			lastFPS += 1000;
		}
		fps++;
	}
}
