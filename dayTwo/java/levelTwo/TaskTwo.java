// ask user from a number
// // check whether number is lesser than 0

public class TaskTwo{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter number: ");
        int number = inputCollector.nextInt();
        
        if(number >= 0){
            System.out.printf("%d is a positive", number);
        } else{
            System.out.printf("%d is a negative", number);
        }
    }
}
