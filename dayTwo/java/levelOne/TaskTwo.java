// Collect user's age from terminal
// Add 5 years to the user's age to predict how many years user will be in 5 years time


public class TaskTwo{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = inputCollector.nextInt();
        int newAge = age + 5;
        
        System.out.println("You will be " + newAge + " years in 5 years from now");
    }
}
