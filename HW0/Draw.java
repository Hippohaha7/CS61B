public class Draw {
    public static void main(String[] args) {
 
       int row = 0;
       int SIZE = 5;
       while (row <= SIZE) {
            int col = 0;
            while (col <= row) {
                System.out.print('*');
                col = col + 1;
            }
          row = row + 1;
          System.out.println();
       
        }      
    }
 }