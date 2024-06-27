
//Java Program to Add Two Binary Strings

public class add_Binary {
   static String addToBinary(String x , String y){

       int num1 = Integer.parseInt(x);
       int num2 = Integer.parseInt(y);

       int sum = num1 + num2;

       String res = Integer.toBinaryString(sum);
       return res;
   }
  public static void main(String[]args){
       String  x = "10";
       String  y = "01";

       System.out.println(addToBinary(x,y));
  }


}
