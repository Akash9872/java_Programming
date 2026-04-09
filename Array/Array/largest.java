package Array;

public class largest {
    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1,5,3,7,5,3};
        System.out.println("The largest number is: " + GetLargest(numbers));
    }
    
}
