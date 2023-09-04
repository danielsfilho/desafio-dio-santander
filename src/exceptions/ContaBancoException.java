package exceptions;

public class ContaBancoException extends RuntimeException{

    public ContaBancoException() {
    }

    public ContaBancoException(String message) {
        super(message);
    }
}
