import java.util.Scanner;

public class Swap {

    public static void main(String [] args){
        int a;
        int b;
        System.out.println("Enter a first number:");
        Scanner sc = new Scanner(System.in);
         a=sc.nextInt();
         System.out.println("Enetr a second number:");
         b=sc.nextInt();
         int temp = a;
         a=b;
         b= temp;

        System.out.println("Swapped numbers: a = " + a + ", b = " + b);
        sc.close();

    }
}
