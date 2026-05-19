public class TaskSeven{
    public static void main(String[] args){
                
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
                
        System.out.print("enter password: ");
        String password = inputCollector.nextLine();
        
        String mainPass = "admin123";
        
        if(password.equals("admin123")){
            System.out.println("password is correct");
        } else{
             System.out.println("password is incorrect");
        }
    }
}
