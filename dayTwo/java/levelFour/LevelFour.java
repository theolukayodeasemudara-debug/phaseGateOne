public class LevelFour{
    
    public static void addNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }
    
    public static void isEven(int num){
        if(num % 2 == 0){
            System.out.println("number is even");
        }
    }
    
    public static int squareRoot(int num){
        return num * num;
    }
    
    public static int fahrenheitConverter(int celsius){
        int fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    
    public static boolean primeChecker(int num){
        
        for(int index = 2; index <= num/index; index++){
            
            // if(number % index == 0){
                
            // }
        }
        return true;
    }
    
    public static void largestChecker(int num1, int num2, int num3){
    
        if(num1 > num2 && num1 > num3){
            System.out.printf("%d is the largest \n", num1);
        }
        if(num2 > num1 && num2 > num3){
            System.out.printf("%d is the largest \n", num2);
        }
        if(num3 > num1 && num3 > num2){
           System.out.printf("%d is the largest \n", num1);
        }
    }
    
    
    public static void simpleInterest(double principal, double rate, double time){
        System.out.println((principal * rate * time)/ 100);
    }
    
    public static void areaOfRectangle(int length, int breadth){
        System.out.println(length * breadth);
    }
    
    
    public static double reverseNum(double number){
        double reversed = 0;
        
        while(number != 0){    
        double digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number/10;
        }
        
        return reversed;
    }
    
    public static void characterOccurence(String string){
        System.out.println(string.length());
        
        // int count = 0;
        // for(int index = 1; index <= string.length; index++){
        //     System.out.println(string);
        //     // if(string[index].equals("o")){
        //     //     System.out.println()
        //     // }
        // }
    }


    public static void main(String[] args){
        addNumbers(2,4);
        
        isEven(10);
        
        System.out.println(squareRoot(2));
        
        System.out.println(fahrenheitConverter(100));
        
        System.out.println(primeChecker(10));
        
        largestChecker(10,12,11);
        
        simpleInterest(5000, 5, 20.00);
        
        areaOfRectangle(20, 5);
        
        System.out.println(reverseNum(12345));
        
        characterOccurence("olukayode");
    }
}
