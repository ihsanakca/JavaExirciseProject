package day10_GeneralQuestions;

public class IhsanExceptionTest {
    public static void main(String[] args)  {
        String[] strings = {"Ihsan", "Hasan", "C", "D", "E"};


           if (strings[0].equals("Ihsan")) throw new IhsanException("İsim İhsan Olamaz");

          //  if (strings[1]=="Hasan") throw new HasanException("İsim Hasan Olmaz");

    }

}
