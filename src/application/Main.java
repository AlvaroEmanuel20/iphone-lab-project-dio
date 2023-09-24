package application;

import java.util.Arrays;
import java.util.List;

import entities.Iphone;

public class Main {

	public static void main(String[] args) {

		List<String> contacts = Arrays.asList("Álvaro", "Fernando", "Joana", "Luiza", "Manuel");
		List<String> musics = Arrays.asList("Superhero", "Ocean Drive", "Starboy", "Get it together");
		Iphone iphone = new Iphone("Black", "Iphone 1", musics, contacts);
		
		iphone.call("Álvaro");
		iphone.call("João");
		iphone.play();
		iphone.selectMusic("Ocean Drive");
		iphone.selectMusic("Love");

	}

}
