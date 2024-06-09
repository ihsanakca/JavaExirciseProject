package day10_GeneralQuestions;

public class C01_TotalSum {
    public static void main(String[] args) {
        System.out.println("totalSumOfInt(58) = " + totalSumOfInt(564288));
        System.out.println("addDigits(528454288) = " + addDigits(654288));

    }
    //Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

    //For example:
    //Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

    public static int totalSumOfInt(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
            if (result > 9 & num == 0) {
                return totalSumOfInt(result);
            }
        }
        return result;
    }

    public static int addDigits(int num) {
        while (num > 9) {
            int temp = 0;
            while (num > 0){
                temp += num%10;
                num /= 10;
            }
            num = temp;
        }

        return num;
    }
}
