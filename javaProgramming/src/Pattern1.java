public class Pattern1 {
//Java Program to Print Right Triangle Star Pattern

   public static void StarRightTriangle(int n){
       int i, j;

       for( i=0; i<n; i++){

           for ( j = 0; j<=i; j++){
               System.out.print(" * ");

           }
           System.out.println("");

       }

   }
   public static void main(String[] args){
       int k=5;
       StarRightTriangle(k);
   }

}
