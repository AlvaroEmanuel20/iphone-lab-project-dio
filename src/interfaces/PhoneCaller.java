package interfaces;

public interface PhoneCaller {
	
	public void call(String contact);
	
	public default void acceptCall() {
		System.out.println("Call accepted");
	}
	
	public default void rejectCall() {
		System.out.println("Call rejected");
	}
	
	public default void voiceMailer() {
		System.out.println("Calling voice mailer");
	}
	
}
