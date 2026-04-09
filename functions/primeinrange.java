package functions;

public class primeinrange {
    public static void PrimeinRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime((int)i)) {
                System.out.println(i);
            }
        }
        

    }
  private static boolean isPrime(int i) {
        if (i <= 1) return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeinRange(20);
    }
}
