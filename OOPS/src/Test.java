import java.util.Arrays;

public class Test {
    public static void main(String[] args)

    {
        Test1 a = new Test1();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        a.m1(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));


    }


}

class Test1{

    public void   m1(int[] arr , int a, int b){
        int temp=0;
        temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void  m2(int a,int b){
        System.out.println("before swap m2" +" = "+ "a"+"="+ a + ","+"b"+"="+ b);
        b= b-a;
        a = a+b;
        b= a-b;

        System.out.println("After  swap m2" +" = "+ "a"+"="+ a + ","+"b"+"="+ b);

    }

}

