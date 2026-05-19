public class TaskSix{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter year: ");
        int year = inputCollector.nextInt();
        
        if(year % 4 == 0){
            System.out.printf("%d is a leap year", year);
        } else{
            System.out.printf("%d is not leap year", year);
        }
        
    }
}
