package day3_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ali");
        list.add("ahmet");
        list.add("veli");
        list.add("kazım");
        list.add("kemal");

        System.out.println("countFirstLetter(list) = " + countFirstLetter(list));

    }
    // we  can use letters as a loop parameter
    public static List<String> countFirstLetter(List<String> list){
        List<String> resultList=new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i==list.get(j).charAt(0)){
                    resultList.add(list.get(j).charAt(0)+"");
                }
            }
        }
        return resultList;
    }
}
