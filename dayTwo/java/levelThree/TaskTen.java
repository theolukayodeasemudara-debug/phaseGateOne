public class TaskTen{
    public static void main(String[] args){
        
        int count = 0;
        int digit = 1234;
        while(number != 0){
            digit = number % 10;
            number = number * 10 + digit;
            count++;
            number/=10;
        }
        System.out.println(count);
    }
}
