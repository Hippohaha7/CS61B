import java.util.Arrays;

public class mystery2{
    public static int mysteryJava(int[] inputArray, int k) {
        /**Function to check the min number after the index K */
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
                }   
            index = index + 1;
        }
        return answer;
    }
    public static int[] mysteryJava2(int[] inputArray) {
        /**sort the number by the mysteryJava function which would be sort from small to large numbers */
        int index = 0;
        while (index < inputArray.length) {
                int targetIndex = mysteryJava(inputArray, index);
                int temp = inputArray[targetIndex];
                inputArray[targetIndex] = inputArray[index];
                inputArray[index] = temp;
                index = index + 1;
        }
        return inputArray;   
    }

    public static void main(String[] args) {

        int[] a = {3, 0, 4, 6 ,3};
        int[] array = mysteryJava2(a);
        System.out.println(Arrays.toString(array));
    }
}