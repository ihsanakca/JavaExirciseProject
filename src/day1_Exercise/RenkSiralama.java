package day1_Exercise;

import java.util.*;

public class RenkSiralama {

    public static void main(String[] args) {
        String str = "red2 blue5 black1 green3 gold6 purple4";
        System.out.println("orderColors(str) = " + orderColors(str));
        System.out.println(orderColors2(str));
        System.out.println("orderColors3(str) = " + orderColors3(str));

        System.out.println("orderColors4(str) = " + orderColors4(str));

        System.out.println("orderColors5(str) = " + orderColors5(str));

        System.out.println("orderColors6(str) = " + orderColors6(str));
        System.out.println("orderColors7(str) = " + orderColors7(str));
        System.out.println("orderColors8(str) = " + orderColors8(str));
        System.out.println("orderColors9(str) = " + orderColors9(str));
        System.out.println("sortColor9danBuyuklerIcin(str) = " + sortColor9danBuyuklerIcin(str));

    }

    public static String orderColors(String str) {
        String[] words = str.split(" ");
        //Arrays.sort(words, Comparator.comparing(s -> Integer.parseInt(s.replaceAll("\\D", ""))));
        Arrays.sort(words, Comparator.comparing(e -> Integer.parseInt(e.replaceAll("[A-Za-z]", ""))));

        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[0-9]", "");
        }
        String sortedStr = String.join(" ", words);
        return sortedStr;
    }

    public static String orderColors2(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(words[i].length() - 1) + words[i];
        }
        Arrays.sort(words);
        //System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^A-Za-z]", "");
        }
        //  System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        String join = String.join(" ", words);


        return join;
    }

    public static String orderColors3(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(words[i].length() - 1) + words[i];
        }
        Arrays.sort(words);

        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace(words[i].substring(0, 1), "");
        }
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result.trim();
    }

    public static String orderColors4(String str) {
        String[] words = str.split(" ");
        List<Integer> nums = new ArrayList<>();
        String result = "";
        for (String word : words) {
            nums.add(Integer.valueOf(word.replaceAll("[A-Za-z]", "")));
        }
        List<Integer> sortedNums = new ArrayList<>(nums);
        Collections.sort(sortedNums);

        for (int i = 0; i < words.length; i++) {
            result += words[nums.indexOf(sortedNums.get(i))].replaceAll("[0-9]", "") + " ";
        }

        return result;
    }

    public static String orderColors5(String colorsWithNumbers) {
        String[] unOrders = colorsWithNumbers.trim().toLowerCase().split(" ");
        Map<Integer, String> newMap = new HashMap<>();

        for (int i = 0; i < unOrders.length; i++) {
            newMap.put(Integer.parseInt(unOrders[i].substring(unOrders[i].length() - 1)), unOrders[i].substring(0, unOrders[i].length() - 1));
        }
        System.out.println("newMap = " + newMap);
        String str = "";
        for (String value : newMap.values()) {
            str += value + " ";
        }

        return str;
    }

    public static String orderColors6(String str) {
        String[] strAr = str.split(" ");
        Map<Integer, String> maplist = new TreeMap<>();
        for (int i = 0; i < strAr.length; i++) {
            int key = Integer.parseInt(strAr[i].charAt(strAr[i].length() - 1) + "");
            String value = strAr[i].substring(0, strAr[i].length() - 1);
            maplist.put(key, value);
        }
        System.out.println("maplist = " + maplist);

        String result = String.join(" ", maplist.values());
//        return maplist.values().toString().replace("[", "").replace("]", "")
//                .replace(",", " ");

        return result;
    }

    public static String orderColors7(String str) {
        String[] array = str.split(" ");
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(Integer.parseInt(array[i].replaceAll("[a-z]", "")),
                    array[i].replaceAll("[0-9]", ""));
        }
        return String.join(" ", map.values());
    }

    // sayılar uniq olmasa da çalışıyor
    public static String orderColors8(String str) {
        String sortStr = "";
        String[] array = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i].replaceAll("[a-z]", "")));
        }
        Collections.sort(list);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].replaceAll("[a-z]", "").equals(String.valueOf(list.get(i)))) {
                    sortStr += array[j].replaceAll("[0-9]", "") + " ";
                    array[j] = "";
                }
            }
        }
        return sortStr;
    }

    public static String orderColors9(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (Integer.parseInt(words[i].replaceAll("[A-Za-z]", "")) > Integer.parseInt(words[j].replaceAll("[A-Za-z]", ""))) {
                    String temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        return String.join(" ", words).replaceAll("[0-9]", "");
    }

    public static String sortColor9danBuyuklerIcin(String str) {
        String[] sArr = str.split(" ");
        String result = "";
        int[] nums = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            nums[i] = Integer.parseInt(sArr[i].replaceAll("[^0-9]", ""));
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int a = Integer.parseInt(sArr[j].replaceAll("[^0-9]", ""));
                if (nums[i] == a) {
                    result += sArr[j].replaceAll("[^a-z]", " ");
                }
            }
        }
        return result;
    }


}
