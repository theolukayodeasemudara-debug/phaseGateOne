// ask user from a number
// check whether number is lesser than 0

public class TaskThree{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter your score: ");
        int number = inputCollector.nextInt();
        
        if(number >= 50){
            System.out.printf("passed");
        } else{
            System.out.printf("failed");
        }
    }
}
