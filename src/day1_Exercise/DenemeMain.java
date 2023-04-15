package day1_Exercise;

import java.util.Arrays;

public class DenemeMain {
    public static void main(String[] args) {


        String[][]dataArray={{"Hasan","70","80","100"},
                             {"Mehmet","50","80","100"},
                             {"Sacit","50","40","90"},
                             {"Yavuz","10","10","60"},
                             {"Ali","80","90","100"}
        };

        for (String []strings:dataArray){
            for (String s:strings){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        System.out.println("Arrays.deepToString(dataArray).length() = " + Arrays.deepToString(dataArray).length());
        System.out.println("Arrays.deepToString(dataArray).length() = " + Arrays.deepToString(dataArray));
        System.out.println(Arrays.deepToString(dataArray).charAt(7));

    }
}
