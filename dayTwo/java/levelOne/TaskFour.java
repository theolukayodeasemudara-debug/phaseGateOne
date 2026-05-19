// // Ask for number one from user
// Ask for number two from user
// sum both numbers and display their product

public class TaskFour{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter your number: ");
        int num1 = inputCollector.nextInt();
        
        System.out.print("enter your number: ");
        int num2 = inputCollector.nextInt();

        
        System.out.println(num1 * num2);
    }
}
