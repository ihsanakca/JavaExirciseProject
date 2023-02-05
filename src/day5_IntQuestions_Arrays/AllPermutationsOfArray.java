package day5_IntQuestions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPermutationsOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<int[]> allPerms = new ArrayList<>();

        permute(arr, 0, allPerms);

        for (int[] perm : allPerms) {
            System.out.println(Arrays.toString(perm));
        }
    }
    private static void permute(int[] arr, int start, List<int[]> allPerms) {
        if (start == arr.length - 1) {
            allPerms.add(arr.clone());
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, allPerms);
            swap(arr, start, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
