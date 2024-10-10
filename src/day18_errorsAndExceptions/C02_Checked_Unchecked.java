package day18_errorsAndExceptions;

import day17_record.EmployeeClass;

import java.io.FileInputStream;

public class C02_Checked_Unchecked {
    public static void main(String[] args) {

        System.out.println("-------------Unchecked Exceptions------------");

        int i = 15;
        int j = 0;

        //   System.out.println(i/j);  //Exception in thread "main" java.lang.ArithmeticException: / by zero

        int[] array = {20, 36, 98, 3, 2, 5};

       // System.out.println(array[10]);  //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

        String str = null;

    //    System.out.println(str.length());  //NullPointerException: Cannot invoke "String.length()" because "str" is null

        EmployeeClass isci = null;
     //   System.out.println(isci.getName());  //.NullPointerException: Cannot invoke
        //   "day17_record.EmployeeClass.getName()" because "isci" is null

        System.out.println("-----Checked Exceptions------------");

       // Thread.sleep(9000);

      //  FileInputStream fis = new FileInputStream("path");
    }
}
