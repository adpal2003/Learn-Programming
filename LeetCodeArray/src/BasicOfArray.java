import java.util.Arrays;

public class BasicOfArray {

    public static void main(String[] args) {

//        int[] a = new int[]{1,2,3,4,5};


//        String  a[] = new String[10];
//        System.out.println(Arrays.toString(a));

        // for each loop
//       for(int i:a){
//       System.out.println(i);
//
//       }


//        int[][] a= {{10,20,30,40},{50,60},{70,80,90}};

//        System.out.println(a[0].length);

//        for printing 2D array
//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a[i].length; j++){
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//
//         }

//    printing 3D array

//        int[][][] a = {{{10,20},{20,40,50,60},{70,80,90} }};
//
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a[i].length; j++){
//                for(int k=0; k<a[i][j].length; k++){
//                    System.out.print(a[i][j][k]+ " ");
//                }
//
//                System.out.println();
//            }
//
//        }



//        Anonymous array

        BasicOfArray.sum(new int[]{10,20,30});



    }


    static void sum(int[] no){
     int sum =0;
     for(int i: no ){
         sum = sum + i;

        }
        System.out.println(sum);
    }
}
