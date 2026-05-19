public class TaskFive{
    public static void main(String[] args){
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        
        int number = inputCollector.nextInt();
        int factorial = 1;
        for(int index = number;index >= 1; index--){
            factorial *= index;
        }
        System.out.println(factorial);
    }
}
