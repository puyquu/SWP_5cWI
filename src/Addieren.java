/**
 * @author Emanuel Zech
 * <p>
 * created on 30.09.2022
 */

import java.util.Scanner;


public class Addieren {

    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);

        int temp1 = number1.nextInt();
        int temp2 = number2.nextInt();


        int length1 = String.valueOf(temp1).length();
        int length2 = String.valueOf(temp2).length();


        int repetitions = (length1 + length2) / 2 + 2;

        int firstNumber = temp1;
        int secondNumber = temp2;
        for (int i = 0; i < repetitions; i++) {

                int partialresult = firstNumber % 10 + secondNumber % 10;
                int addup = partialresult / 10;
            if(firstNumber != 0 && secondNumber != 0 | addup != 0){
                int rest = partialresult % 10;


                if (partialresult >= 10) {
                    System.out.println(rest);


                    firstNumber = firstNumber/10 + addup;
                    secondNumber = secondNumber/10;


                } else {
                    System.out.println(partialresult);
                    firstNumber = firstNumber/10;
                    secondNumber = secondNumber/10;

                }


            }
            }

    }
}
