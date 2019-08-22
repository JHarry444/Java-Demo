package main;

public class Constants {

	private static final Constants INSTANCE = new Constants();

	private String path = "path";

	private Constants() {
	}

	public static Constants getInstance() {
		return INSTANCE;
	}

	public String getPath() {
		return path;
	}

}
