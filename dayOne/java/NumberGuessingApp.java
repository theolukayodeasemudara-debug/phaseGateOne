public class NumberGuessingApp{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        
        
        double guessNum = inputCollector.nextInt();
        // double secretNumber = random.Random();
        
        
        double secretNum = Math.floor(Math.random() * 100 + 1);
        
        
        
        int count = 0;
        
        while(true){
            System.out.println("Enter your number");
            guessNum = inputCollector.nextInt();
            count++;
            
            if(guessNum > 100){
                System.out.println("engineer please abort!!!");
            }
            
             if(guessNum > secretNum){
                 System.out.println("higher");
             } else if(guessNum < secretNum){
                 System.out.println("lower");
             } else if(secretNum == guessNum){
                 System.out.println("correct!!!");
                 break;
             } 
             
             if(count == 5) {
                 System.out.println("maximum tries exceeded");
                 System.out.println("%d no of tries".formatted(count));
                 System.out.println("secrete number is " + secretNum);
                 break;
             }
        }
    }
}
