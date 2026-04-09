public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {34,4,54,65,66,45,334};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
 