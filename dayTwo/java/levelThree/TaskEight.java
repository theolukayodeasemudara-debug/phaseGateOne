public class TaskEight{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.println("enter a number");
        int number = 0;
        
        int sum = 0;
        while(number != 0){
             System.out.println("enter a number");
             number = inputCollector.nextInt();
             
             sum += number;
        }
        
        System.out.println(sum);
    }
}

