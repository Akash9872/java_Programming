public class ternaryoperator {
    public static void main(String[] args) {
        int number = 10;
        String result;

        // Using ternary operator
        result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
    }
    
}
