package day18_errorsAndExceptions;

public class IhsException extends RuntimeException{

    @Override
    public String getMessage() {
        return "insan hatası";
    }
}
