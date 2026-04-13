public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {34,4,54,65,66,45,334};
        int n = arr.length;
        int i = 0;
        int m = n-1;
        while(i<m) {
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
            i++;
            m--;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
 