package day18_errorsAndExceptions;

public class C06_MultiCatch {
    public static void main(String[] args) {

        String str = null;

        System.out.println("Test başladı");

        try {
            System.out.println(str.length());
            System.out.println(str.substring(0,5));
            int i = Integer.parseInt(str);
            System.out.println("i = " + i);
        }
        catch (NullPointerException e){
            System.out.println("birinci catch");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("ikinci catch");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("üçüncü catch");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("dördüncü catch");
            e.printStackTrace();
        }

        System.out.println("Test bitti");


    }
}
