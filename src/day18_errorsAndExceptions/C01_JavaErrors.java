package day18_errorsAndExceptions;

import day00_GeneralUsage.SortEachPart;

public class C01_JavaErrors {
    public static void main(String[] args) {

        check(-10);
    }
    public static void check(int i){

        if (i == 0) {
            System.out.println("İşlem Tamam");
            return;
        }else {
            System.out.println(i);
            i++;
            check(i);
        }

    }


}
