package functions;

public class binomial {
    public static int BinCoeff(int n, int r) {
        if (n < r || r < 0) {
            System.out.println("Error: Invalid input (require n >= r >= 0)");
            return 0;
        }
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        int binom = fact_n / (fact_r * fact_n_r);
        return binom;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    
    public static void main(String args[]) {
        System.out.println("Binomial Coefficient C(5,2) is: " + BinCoeff(5,2));
    }
}
