import java.util.Arrays;

public class BubleShort1 {

    public static void main(String[] args) {
        int[] arr={36,19,29,12,5};
        int temp;
        for(int i=0; i<arr.length; i++){
            int flag =0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;

            }

        }
        System.out.print(Arrays.toString(arr));

    }
}

