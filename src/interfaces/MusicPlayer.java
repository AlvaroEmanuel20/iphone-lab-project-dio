package interfaces;

public interface MusicPlayer {

	public default void play() {
		System.out.println("Playing music");
	}
	
	public default void pause() {
		System.out.println("Paused music");
	};
	
	public void selectMusic(String music);
	
}
