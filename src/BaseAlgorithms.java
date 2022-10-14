/**
 * @author Emanuel Zech
 * <p>
 * created on 13.10.2022
 */
public class BaseAlgorithms {

    public static void main(String[] args) {
        int[] intArray = {2,4,2,7,2,5,5};
        int[] RevArray = revert(intArray);
        int maxNumber = getMax(intArray);
        int minNumber = getMin(intArray);
        printArray(RevArray);
        printNumber(maxNumber);
        printNumber(minNumber);
    }

    public static int[] revert(int[] data){
        int[] array = new int[data.length];
        int temp = 0;

        for (int i = data.length- 1; i >= 0; i--) {
            array[temp] = data[i];
            temp++;
        }
        return array;
    }

    public static int getMax(int[] data){
        int temp = data[0];
        for (int i = 0; i < data.length; i++) {
            if(temp < data[i]){
                temp = data[i];
            }
        }
        return temp;
    }

    public static int getMin(int[] data){
        int temp = data[0];
        for (int i = 0; i < data.length; i++) {
            if(temp > data[i]){
                temp = data[i];
            }
        }
        return temp;
    }

    public static void printArray(int[] data){
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + "  ");

        }
        System.out.println();
        System.out.println();
    }

    public static void printNumber(int number){
        System.out.println(number);
        System.out.println();
    }
}

