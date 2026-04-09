import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            if(number % 2==0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }
}
