// create a method that collect user's name from the terminal
// return message that says welcome user

public class TaskOne{
    public static String greetUser(String name){
        return "Welcome to day two " + name;
    }

    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("enter your name: ");
        String name = inputCollector.nextLine();
        
        System.out.println(greetUser(name));
    }
}
