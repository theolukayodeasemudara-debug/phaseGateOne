public class TaskSix{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter length value: ");
        int length = inputCollector.nextInt();
        
        System.out.print("enter breadth value: ");
        int breadth = inputCollector.nextInt();
                
        System.out.println(length * breadth);
    }
}
