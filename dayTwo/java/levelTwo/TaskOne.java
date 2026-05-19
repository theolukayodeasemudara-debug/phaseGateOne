// ask user from a number
// // check whether number is divisible by two

public class TaskOne{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("check whether number is an even number: ");
        int number = inputCollector.nextInt();
        
        if(number % 2 == 0){
            System.out.printf("%d is an even number", number);
        } else{
            System.out.printf("%d is not an even number", number);
        }
    }
}
