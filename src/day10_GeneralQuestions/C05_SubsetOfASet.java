package day10_GeneralQuestions;

import java.util.*;

public class C05_SubsetOfASet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("subsets(nums) = " + subsets(nums));

        System.out.println("subsets2(nums) = " + subsets2(nums));
        System.out.println("subsets3(nums) = " + subsets3(nums));

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(2,3)));

        List<Integer> list = new ArrayList<>(result.get(0));
        list.add(2);
        System.out.println("list = " + list);


    }
    // Given a set of distinct integers, nums, return all possible subsets.

    // Note: The solution set must not contain duplicate subsets.

    // For example,
    // If nums = [1,2,3], a solution is:

    // [
    //   [3],
    //   [1],
    //   [2],
    //   [1,2,3],
    //   [1,3],
    //   [2,3],
    //   [1,2],
    //   []
    // ]


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Boş küme ekleme
        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> subset : result) {
                // Her bir mevcut alt kümeyi kopyala ve yeni elemanı ekle
                List<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }
            // Yeni oluşturulan alt kümeleri sonuç listesine ekle
            result.addAll(newSubsets);
        }
        return result;
    }

    //subsets2(nums) = [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

    public static List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Boş küme ekleme

        for (int num : nums){
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                System.out.println("subset = " + subset);
                subset.add(num);
                System.out.println("subset = " + subset);
                result.add(subset);
            }
        }

        return result;
    }

}


