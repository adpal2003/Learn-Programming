public class HollowRectangle {

    public static void HollowRectanglePattern(int n){
        int m = 5; // You can pass this as a parameter if needed.
        // outer loop
        for(int i = 0; i < n; i++){
            // inner loop
            for(int j = 0; j < m; j++){
                // Check if it's a border position
                if(i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args){
        int k = 5;
        HollowRectanglePattern(k);
    }
}
