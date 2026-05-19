public class LevelFive{

    public static void replaceNegNumbers(int[] numbers){
         for(int index = 0; index < numbers.length; index++){
             if(numbers[index] < 0){
                 numbers[index] = 0;
             }
             System.out.print(numbers[index] + " ");
         }
    }
    
    // public static void changeZeroPositions(int[] numbers){
    //     for(int index = 0; index < numbers.length; index++){
    //         if(numbers[index] == 0){
    //             numbers[index];
    //         }
    //         System.out.print(numbers[index] + " ");
    //     }
    // }
    
    
    public static void main(String[] args){
        int[] myArray = {-1,-2,-3,-4,5,1,6,7};
        int[] secondArray = {0,0,0,1,2,3,4,5};
        replaceNegNumbers(myArray);
        changeZeroPositions(secondArray);
    }
}
