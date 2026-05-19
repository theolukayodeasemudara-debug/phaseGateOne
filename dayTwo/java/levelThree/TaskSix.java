public class TaskSix{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("enter a number");
                
        int number = inputCollector.nextInt();
        int sum = 0;
        for(int index = 1; index <= number; index++){
            sum += index;
        }
        System.out.println(sum);
    }
}
