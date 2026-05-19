public class TaskSeven{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int sum = 0;
        for(int index = 1; index <= 5; index++){
            System.out.println("enter a number");
            int number = inputCollector.nextInt(); 
            sum += number;           
        }
        System.out.println(sum);
    }
}
