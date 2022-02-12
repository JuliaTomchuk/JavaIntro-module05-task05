package my.home.task05.logic;

public class NoSuchFlowersException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoSuchFlowersException(String message) {
		super(message);
	}

	public NoSuchFlowersException(Exception e) {
		super(e);
	}

	public NoSuchFlowersException(String message, Exception e) {
		super(message, e);
	}

	public NoSuchFlowersException() {
	}

}
