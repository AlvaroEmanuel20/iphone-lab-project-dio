package entities;

import java.util.List;

import enums.Orientation;
import interfaces.InternetExplorer;
import interfaces.MusicPlayer;
import interfaces.PhoneCaller;

public class Iphone extends Phone implements MusicPlayer, PhoneCaller, InternetExplorer {

	private String model;
	private Orientation orientation = Orientation.VERTICAL;
	private List<String> musics;
	private List<String> contacts;

	public Iphone(String color, String model, List<String> musics, List<String> contacts) {
		super(color);
		this.model = model;
		this.musics = musics;
		this.contacts = contacts;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<String> getMusics() {
		return musics;
	}

	public void setMusics(List<String> musics) {
		this.musics = musics;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public Orientation getOrientation() {
		return orientation;
	}
	
	public void changeOrientation() {
		if (this.orientation == Orientation.HORIZONTAL) {
			this.orientation = Orientation.VERTICAL;
		} else {
			this.orientation = Orientation.HORIZONTAL;
		}
	}

	@Override
	public void selectMusic(String music) {
		int result = this.musics.indexOf(music);
		
		if (result == -1) {
			System.out.println("Music not found");
		} else {
			System.out.println("Selected music " + this.musics.get(result));
		}
	}

	@Override
	public void call(String contact) {

		int result = this.contacts.indexOf(contact);
		
		if (result == -1) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Calling " + this.contacts.get(result));
		}
		
	}

}
