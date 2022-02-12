package my.home.task05.logic;

public class NoSuchRibbonsException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoSuchRibbonsException(String message) {
		super(message);
	}

	public NoSuchRibbonsException(Exception e) {
		super(e);
	}

	public NoSuchRibbonsException(String message, Exception e) {
		super(message, e);
	}

	public NoSuchRibbonsException() {
	}

}
