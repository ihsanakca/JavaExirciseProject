package day2_InterviewQuestions_String;

import java.util.*;

public class Challenge {
    public static void main(String[] args) {
        String str = "asaffsf";
        rotateAndErase(str);
//        System.out.println("isValid2(str) = " + isValid2(str));
//        System.out.println("isValid3(str) = " + isValid3(str));

        System.out.println("isValid4(str) = " + isValid4(str));

        List<Integer> tasks = new ArrayList<>(List.of(5, 10, 20, 1, 4));

        Integer cycle = 15;
        //System.out.println("getTaskIndexAtCycle(tasks,cycle) = " + getTaskIndexAtCycle(tasks, cycle));
        // System.out.println("getTaskIndexAtCycle2(tasks,cycle) = " + getTaskIndexAtCycle2(tasks, cycle));



    }

    /*
    In this challenge, we want to iterate through on the characters of the input string and check whether the number of the
    occurrences for each characters are equal. For example, "abcde" is a valid string, on the other hand,
    "abcdeee" is not because count of 'e' is 3, not 1 as the others.
    Moreover, we have chance to remove only one character from the string in order to make it valid.
    Think of a scenario: "xyzz" is given to us and we should remove one of these 'z' characters.
    In this case, we can assume that the string is valid since each existing characters exist only single time after the removal operation.
    Specification

    .isValid(str)--->Method Name
    Decide the given string is valid in terms of character counts including possibility of one character removal
    Parameters
    str: String - input to be searched
    Return Value
    boolean - final decision about that string, true or false
    Constraints
    •    Input string consists of English alphabet characters
    •    All of the characters are lowercase
    Examples   aaabbbssss
    "cac" => true - we can get rid of one these 'c' chars
    "aabcc" => true - if we remove 'b', then it is ok
    "efgh" => true - we even don't need to use remove operation
    "mumukkpp" => true - all of them occurred twice
    "pppenm" => false - even tough we delete one 'p', thats not enough, still one more 'p' exists
    "ekekua" => false - we can either remove 'u' or 'a', but in any case, the remaining one breaks the rule
     */
    public static boolean isValid(String str) {
        String str1 = str.toLowerCase();
        String str2 = str.toLowerCase();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); ) {
            int count = 0;
            String control = str1.substring(0, 1);
            count = str1.length() - str1.replace(control, "").length();
            list.add(count);
            str1 = str1.replace(control, "");
        }
        System.out.println("list = " + list);

        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println("list1.size() = " + list1.size());
        if (list1.size() > 2) {
            return false;
        } else if (list1.size() == 1) {
            return true;
        }
        System.out.println("list1 = " + list1);

        Collections.sort(list);
        System.out.println("list = " + list);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            list2.add(count);
            int n = list.get(0);
            list.removeIf(e -> e == n);
        }
        Collections.sort(list2);
        System.out.println("list2 = " + list2);
//burası hatalı alttaki metod düzgün çalışıyor....
        if ((list2.get(0) == 1) && (list1.get(0) + 1 == list1.get(1) || list1.get(0) - 1 == list1.get(1))) {
            return true;
        }


        for (int i = 0; i < str2.length(); i++) {
            String newStr = str2.substring(0, i) + str2.substring(i + 1);
            Map<Character, Integer> newCharCount = new HashMap<>();
            for (char c : newStr.toCharArray()) {
                newCharCount.put(c, newCharCount.getOrDefault(c, 0) + 1);
            }
            Collection<Integer> newCounts = newCharCount.values();
            if (newCounts.stream().distinct().count() == 1) {
                return true;
            }
        }


//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) != list.get(j)) {
//                    return false;
//                }
//            }
//            return true;
//        }
        return false;
    }

    public static boolean isValid2(String str) {  //acaabbbccssssdddd 3 3 3   4    -> 3,4
        String str1 = str.toLowerCase();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str1.length(); ) {
            int count = 0;
            String control = str1.substring(0, 1);
            count = str1.length() - str1.replace(control, "").length();
            list.add(count);
            str1 = str1.replace(control, "");
        }

        List<Integer> list1 = list.stream().distinct().toList();

        if (list1.size() > 2) {
            return false;
        } else if (list1.size() == 1) {
            return true;
        }
//        else if ((list1.size() == 2) && ((list1.get(0) == 1) || list1.get(1) == 1)) {
//            return true;
//        }

        List<Integer> list11 = new ArrayList<>();
        list11.addAll(list1);
        Collections.sort(list11);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
              list2.add(count);
            int n = list.get(0);
            list.removeIf(e -> e == n);
        }
        Collections.sort(list2);
        return (list2.get(0) == 1) && (list11.get(1) - 1 == list11.get(0))||((list2.get(0) == 1) && (list11.get(0) == 1));
    }

    public static boolean isValid3(String str) {
        String str1 = str.toLowerCase();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str1.length(); ) {
            int count = 0;
            String control = str1.substring(0, 1);
            count = str1.length() - str1.replace(control, "").length();
            list.add(count);
            str1 = str1.replace(control, "");
        }

        List<Integer> list1 = list.stream().distinct().toList();

        if (list1.size() > 2) {
            return false;
        } else if (list1.size() == 1) {
            return true;
        }
        List<Integer> list11 = new ArrayList<>();
        list11.addAll(list1);
        Collections.sort(list11);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            list2.add(count);
            int n = list.get(0);
            list.removeIf(e -> e == n);
        }
        Collections.sort(list2);
        return (list2.get(0) == 1) && (list11.get(1) - 1 == list11.get(0))||((list2.get(0) == 1) && (list11.get(0) == 1));
    }

    public static boolean isValid4(String str) {
        String str1 = str.toLowerCase();
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < str1.length(); ) {
            int count;
            String control = str1.substring(0, 1);
            count = str1.length() - str1.replace(control, "").length();
            list.add(count);
            str1 = str1.replace(control, "");
        }
        if (list.stream().distinct().count() == 1) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < newStr.length(); ) {
                int count;
                String control = newStr.substring(0, 1);
                count = newStr.length() - newStr.replace(control, "").length();
                list1.add(count);
                newStr = newStr.replace(control, "");
            }
            if (list1.stream().distinct().count() == 1) {
                return true;
            }
        }
        return false;
    }

    public static void rotateAndErase(String str){

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            System.out.println(newStr);
        }

    }

    /**
     *

     */

    /*
    Scheduling is how the processor decides which jobs(processes) get to use the processor and for how long. The jobs are
    taken from a task pool based on a specific rule.
    One such rule is the Shortest Task First. Under this rule, the next task to execute is the one with shortest execution time.
    If there are multiple jobs with same cycles, the rule is to execute the task with the lower index first.
    In this problem, you will be given a task pool including the execution times (the number of CPU cycles ) for each task.
    Then, you will write a function to determine which task is in execution during a given cycle.
    The task pool will be given as an array of integers. The jobs are identified by their index in this array (zero based).
    And the values in the array represent the number of CPU cycles required to execute that task.
    Your mission is to find the index of the task that is running at a given cycle.
    Let's go over an example scenario
    Consider the following task pool, and an example process of finding the task which executes during the given CPU cycle.
    Tasks array : [3, 4, 3, 2, 5]
    CPU Cycle : 10
    •	According to the Shortest Task First rule, Task 3 (task given at index 3 of the array) has the lowest cycle
    time of 2, so it will be executed first.
    •	Then, Tasks 0 and 2 have the next lowest cycle of 3. Task 0 will be executed first due to the lower index rule.
    And Task 2 will follow next.
    •	Accordingly at CPU cylcle 8 (2+3+3), Task 3, Task 0 and Task 2 will be completed. (see the image below)
    •	Next task will be Task1 with CPU cycle time 4. That means Task 1 will be running from cycle 9 until cycle 12.
    So we see that Task 1 is executing at cycle 10. Accordingly our function should return 1 as the response. (see below)

    Specification
    Challenge.getTaskIndexAtCycle(jobs, cycle)
    Returns the index of the task in execution for a given cycle.
    Parameters
    jobs: Integers[] - A non-empty array of positive integers representing execution time in cycles needed to finish a task.
    cycle: Integer - A number representing the cycle during which we want to find the task in execution
    Return Value
    Integer - The index of task in execution during the given cycle
    Examples
    jobs	               cycle	Return Value
    [3,10,20,1,2]	        15	         1
    [3,10,10,20,7,5]	    7	         5



     */
    public static Integer getTaskIndexAtCycle(List<Integer> jobs, Integer cycle) {
        List<Integer> newTask = new ArrayList<>();
        newTask.addAll(jobs);
        Collections.sort(newTask);
        int sum = 0;

        for (int i = 0; i < newTask.size(); i++) {  //[3,10,20,1,2]	   1 2 3 10 20
            sum += newTask.get(i);
            if (sum >= cycle) {
                return jobs.indexOf(newTask.get(i));
            }
        }
        return -1;
    }

    public static Integer getTaskIndexAtCycle2(List<Integer> jobs, Integer cycle) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(jobs);
        Collections.sort(list1);

        List newList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {   //  [3,10,10,20,7,5]	    43
            for (int j = 0; j < list1.get(i); j++) {
                newList.add(list1.get(i));
            }
        }
        System.out.println(newList);
        return jobs.indexOf(newList.get(cycle));
    }

}
