package Array;
public class lin_search {
    public static int linear_search(int numbers[], int keys) {
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] == keys) {
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int keys = 20;

        int index = linear_search(numbers, keys);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The key is found at index: " + index);  
        }
    }
}
