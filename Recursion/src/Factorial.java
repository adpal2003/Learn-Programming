
// Using recursion

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(7));
    }
    public static int fac(int n){
        if(n == 0) {
            return 1;
        }
        return n*fac(n-1);
    }
}
