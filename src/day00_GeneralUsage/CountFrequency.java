package day00_GeneralUsage;

public class CountFrequency {
    public static void main(String[] args) {
        //Loop through the array and count the occurrence of each element as frequency and
        // store it in another array fr. 1    2   8  3   2   2   2   5   1
        int[] elements = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] freq = new int[elements.length];
        boolean[] countAlready = new boolean[elements.length];


        for (int i = 0; i < elements.length; i++) {
            int count = 0;
            if (!countAlready[i]) {
                for (int j = 0; j < elements.length; j++) {
                    if (elements[i] == elements[j]) {
                        count++;
                        countAlready[j] = true;
                    }

                }
                freq[i] = count;


            }
            System.out.println(elements[i] + "  |  " + freq[i]);

        }
    }
}
