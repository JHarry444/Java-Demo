package main;

import java.util.Animal;
import java.util.ArrayList;
import java.util.Cage;
import java.util.HashMap;
import java.util.Lion;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Penguin;

public class App {

	public static void main(String[] args) {
		Person chez = new Person(28, 78, 68, null, null);
		Person chris = new Person();
		chris.setAge(24);
		chris.setHeight(58);
		chris.setWeight(56);

		Person jH = new PersonBuilder().age(25).weight(88).height(100).build();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		System.out.println(list);
		for (int i : list) {
			System.out.println(i);
		}
		Optional<Integer> sum = list.stream().filter(num -> num % 2 == 0).map(num -> num * num)
				.reduce((prev, next) -> prev + next);
		System.out.println("Max: " + sum.orElseThrow(() -> new OutOfMemoryError()));

		Cage<Penguin> n00tN00t = new Cage<>();
		Cage<Lion> lionCage = new Cage<>();
		Cage<Animal> animalCage = new Cage<>();
		Penguin pingu = new Penguin();
		Lion simba = new Lion();
		animalCage.setCaged(pingu);
		n00tN00t.setCaged(pingu);
		lionCage.setCaged(simba);
		animalCage.setCaged(simba);

		Map<Integer, String> map = new HashMap<>();
		map.entrySet().forEach(System.out::println);
	}
}
