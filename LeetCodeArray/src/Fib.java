public class Fib {

    public static void main(String[] args) {

        int a=0,b=1,c;
  // 1 2 3 4 5 6 7 8
        for(int i=1; i<8; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
