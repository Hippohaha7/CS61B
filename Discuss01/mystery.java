public class mystery{
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

    public static void main(String[] args) {

        int[] a = {3, 0, 4, 6 ,3};
        int k = 2;
        
        System.out.println(mysteryJava(a, k));
    }
}