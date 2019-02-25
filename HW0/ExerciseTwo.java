public class ExerciseTwo{
    public static int max(int[] m){
        int temp = 0;
        for (int x = 0; x < m.length; x++){
            if (temp < m[x]){
                temp = m[x];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        system.out.println(max(numbers));
    }
}