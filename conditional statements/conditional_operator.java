public class conditional_operator {
    public static void main(String[] args) {
        int age = 15;
        if(age>=18) {
            System.out.println("You can vote");
        }
        if(age>13 && age<18) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You cannot vote");
        }
    }
}
