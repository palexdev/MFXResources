package io.github.palexdev.mfxresources;

import java.io.InputStream;
import java.net.URL;

/**
 * Utility class which manages the access to this project's assets.
 * Helps keeping the assets files structure organized.
 */
public class ResourcesManager {

	private ResourcesManager() {}

	public static URL loadURL(String path) {
		return ResourcesManager.class.getResource(path);
	}

	public static String load(String path) {
		return loadURL(path).toString();
	}

	public static InputStream loadStream(String name) {
		return ResourcesManager.class.getResourceAsStream(name);
	}
}
