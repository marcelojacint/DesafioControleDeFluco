package exceptions;

public class parametrosInvalidosException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public parametrosInvalidosException(String msg) {
		super(msg);
	}

}
