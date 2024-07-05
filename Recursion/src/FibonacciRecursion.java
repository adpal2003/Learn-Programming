public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(ans);
    }
    public static int fib(int n){
        // base condition
        if(n<2){
            return n;

        }
        return fib(n-1)+fib(n-2);
    }
}
