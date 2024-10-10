package day18_errorsAndExceptions;

public class C09_IhsExceptionTest {
    public static void main(String[] args) {


        try {
            throw new IhsException();
        } catch (IhsException e) {
            System.out.println(e.getMessage());
        }
    }
}
