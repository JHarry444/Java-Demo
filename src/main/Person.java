package main;

public class Person {

	private int age;

	private int height;

	private int weight;

	private String hairColour;

	private String eyeColour;

	public Person() {
	}

	public Person(int age, int height, int weight, String hairColour, String eyeColour) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.hairColour = hairColour;
		this.eyeColour = eyeColour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

}
