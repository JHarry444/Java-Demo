package main;

public class PersonBuilder {

	private Person person;

	public PersonBuilder() {
		this.person = new Person();
	}

	public PersonBuilder height(int height) {
		this.person.setHeight(height);
		return this;
	}

	public PersonBuilder weight(int weight) {
		this.person.setWeight(weight);
		return this;
	}

	public PersonBuilder eyeColour(String eyeColour) {
		this.person.setEyeColour(eyeColour);
		return this;
	}

	public PersonBuilder hairColour(String hairColour) {
		this.person.getHeight();
		return this;
	}

	public PersonBuilder age(int age) {
		this.person.setAge(age);
		return this;
	}

	public Person build() {
		return this.person;
	}

}
