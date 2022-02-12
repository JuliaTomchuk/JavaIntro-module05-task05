package my.home.task05.logic;

public class NoSuchPaperException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoSuchPaperException(String message) {
		super(message);
	}

	public NoSuchPaperException(Exception e) {
		super(e);
	}

	public NoSuchPaperException(String message, Exception e) {
		super(message, e);
	}

	public NoSuchPaperException() {
	}

}
