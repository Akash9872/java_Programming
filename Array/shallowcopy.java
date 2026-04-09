
public class shallowcopy {
     public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] x = arr; //shallow copy
        x[2] = 100; //modifying x will also modify arr
        System.out.println("arr[2]: " + arr[2]); //Output: 100 
     }
}
