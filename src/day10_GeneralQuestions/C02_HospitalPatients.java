package day10_GeneralQuestions;

import java.util.Arrays;

public class C02_HospitalPatients {
    public static void main(String[] args) {
        String [] patientsDep = {"Ortopedi","Noroloji","KBB","Ortopedi","Ortopedi"};
        System.out.println("Arrays.toString(patientsDep) = " + Arrays.toString(patientsDep));
        System.out.println("mostPatient(patientsDep) = " + mostPatient(patientsDep));
        System.out.println("Arrays.toString(patientsDep) = " + Arrays.toString(patientsDep));  //clone yapmazsak bu bozulur

    }

    //arrayde hastaların yattıkları bölümler var
    // en fazla hasta yatan bölümdeki hasta sayısını veren metod

    public static int mostPatient(String [] strArr){
        if (strArr.length == 0) return 0;
        String [] departments = strArr.clone();
    //    Arrays.sort(departments);
        int max = 0;
        for (int i = 0; i < departments.length; i++) {
            int temp = 0;
            for (int j = 0; j < departments.length; j++) {
                if (departments[i].equals(departments[j])){
                    temp++;
                }
                max = Math.max(max,temp);
            }

        }
        return max;
    }

}
