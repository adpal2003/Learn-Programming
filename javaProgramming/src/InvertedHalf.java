public class InvertedHalf {

    public static void main(String[]args){
        int n = 4;

        m1(n);

    }
    public static void m1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if (i == 0 || i == n-1){
                    System.out.print("*");
                }
                else if (j == 0 || j == n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
