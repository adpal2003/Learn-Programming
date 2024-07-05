public class LargestOFThree {

    static int three(int x, int y, int z){
        if(x>=y && x>=z){
            return x;
        }
        else if(y>=x && y>=z){
            return y;
        }
        else{
            return z;
        }
    }

    public static void main(String[] args) {
       int a=7, b=20,c=56;

        int Large = three(a,b,c);
        System.out.println(Large);
    }
}
