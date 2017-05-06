package by.htp.sportequip.service;

public class ServiceNoSuchUserException extends Exception{

	private static final long serialVersionUID = -3056129830898676862L;

	public ServiceNoSuchUserException() {
		super();
	}

	public ServiceNoSuchUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceNoSuchUserException(String message) {
		super(message);
	}

	public ServiceNoSuchUserException(Throwable cause) {
		super(cause);
	}
}
