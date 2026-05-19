public class TaskEight{
    public static void main(String[] args){
        
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);
                        
    System.out.print("enter day number: ");
    int day = inputCollector.nextInt();    
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }
}
