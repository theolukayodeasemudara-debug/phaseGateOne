public class TaskFour{
    public static void main(String[] args){
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        
        int number = inputCollector.nextInt();
        
        for(int index = 1;index <= number; index++){
            System.out.println(index + " X " + number + " = " + index*number);
        }
    }
}
