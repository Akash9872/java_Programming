package loop;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter range: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter an integer.");
                return;
            }
            int range = sc.nextInt();
            int counter = 1;

            while (counter <= range) {
                System.out.println(counter);
                counter++;
            }
        }
    }
}
