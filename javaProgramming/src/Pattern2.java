public class Pattern2 {

public static void SolidRectangle(int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<=5; j++){
            System.out.print("*");


        }
        System.out.println();
    }
}
public static void main(String[]args){
     int k = 5;
     SolidRectangle(k);
}

}
