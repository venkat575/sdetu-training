package exceptions;

public class NegativePaymentException extends Exception {
	
	double pymnt;
	
	public NegativePaymentException(double pymnt) {
		this.pymnt = pymnt;
	}
	
	public String toString() {
		return "ERROR: Cannot take negative payment " + pymnt;
	}

}
