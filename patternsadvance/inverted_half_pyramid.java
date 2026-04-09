
// public class inverted_half_pyramid{
//     public static void inverted_half_pyramids(int n) {
//         for(int i = 1; i<=n; i++) {

//             for(int j = 1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         inverted_half_pyramids(7);
//     }
    
// }


public class inverted_half_pyramid {
    public static void inverted_half_pyramids(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverted_half_pyramids(5);
    }
}