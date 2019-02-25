public class Draw1b {

    public static void drawTriangle(int N){

        for (int x=0; x<=N; x++ ){
            
            for(int col=0; col<=x; col++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
 }