public class ExerciseFour {
    public static void windowPosSum(int[] a, int n) {

      for (int x= 0; x< a.length; x++){
        if(a[x] < 0){
            continue;
        }else{
          for (int y = 0; y < n; y++){
            if( y+x+1 >= a.length){
              break;
            }else{
              a[x] += a[x+y+1];
            }
          }
        }
      }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
  }