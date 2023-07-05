package day1_Exercise;

import java.util.Arrays;
import java.util.Comparator;

public class RenkSiralama_2 {
    public static void main(String[] args) {
        String str = "red15 blue15 black15 green150 gold150";

        System.out.println(orderColors_1(str));
        System.out.println(orderColors_2(str));
    }

    public static String orderColors_1(String str) {
        String[] colors = str.split(" ");
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (Integer.parseInt(colors[i].replaceAll("[^0-9]", "")) >
                        Integer.parseInt(colors[j].replaceAll("[^0-9]", ""))) {
                    String temp = colors[i];
                    colors[i] = colors[j];
                    colors[j] = temp;
                }
            }
        }
      //  System.out.println(Arrays.toString(colors));

        String result = String.join(" ", colors).replaceAll("[0-9]", "");
        return result;
    }

    public static String orderColors_2(String str) {
        String[] colors = str.split(" ");
        Arrays.sort(colors, Comparator.comparing(colorNum -> Integer.parseInt(colorNum.replaceAll("[A-Za-z]", ""))));


      //  System.out.println(Arrays.toString(colors));
        String result = String.join(" ", colors).replaceAll("[0-9]", "");
        return result;
    }
}
