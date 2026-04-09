public class TwoSum {
    public static void main(String [] args) {
        System.out.println(twoSum(new int[]{1,2,3,4,5}, 9));
    }
    
    static boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for (int j= i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
