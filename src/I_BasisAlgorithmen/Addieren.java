package I_BasisAlgorithmen; /**
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

        int repetitions;

        int firstNumber = number1.nextInt();
        int secondNumber = number2.nextInt();

        int length1 = String.valueOf(firstNumber).length();
        int length2 = String.valueOf(secondNumber).length();

        if (length1 >= length2) {
            repetitions = length1 + 1;
        } else {
            repetitions = length2 + 1;
        }


        for (int i = 0; i < repetitions; i++) {
            int partialresult = firstNumber % 10 + secondNumber % 10;
            int addup = partialresult / 10;
            if (partialresult == 0 && firstNumber == 0 && secondNumber == 0) {
                break;
            } else {
                System.out.println(partialresult % 10);
                if (partialresult >= 10) {
                    firstNumber = firstNumber / 10 + addup;
                    secondNumber = secondNumber / 10;
                } else {
                    firstNumber = firstNumber / 10;
                    secondNumber = secondNumber / 10;
                }
            }
        }
    }
}


