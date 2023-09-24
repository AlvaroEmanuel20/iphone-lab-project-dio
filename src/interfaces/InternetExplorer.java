package interfaces;

public interface InternetExplorer {

	public default void showPage(String url) {
		System.out.println("Showing the page " + url);
	}
	
	public default void newTab() {
		System.out.println("Created new tab");
	}
	
	public default void refreshPage() {
		System.out.println("Page refreshed");
	}
	
}
