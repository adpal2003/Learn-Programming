public class SwapNum {
    static void swapNumber(int m, int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Swapped number:m="+ m + ", n = "+ n );


    }
    public static void main (String[] args){
        int m= 5, n=6;
        swapNumber(m,n);

    }



}
