public class TaskOne{

    public static int[] getArrayInt(int[] array, int number){
        
        // minimum test to make my test pass as expected
        // int[] newArray = {8,-2};
        
        int[] newArray = {};
                
        int count = 0;
        
        for(int index = 0; index < array.length; index++){

            for(int indexAt = index + 1; indexAt < newArray.length; indexAt++){
            
                if(array[index] + array[indexAt] == number){
                
                    newArray[index] = array[indexAt];
                    count += 1;
                    
                    // newArray[count] = array[index];
                }
                
                else continue;
            }
                
        }
        
        return newArray;
        
    }
    

    public static int[] removeDuplicates(int[] array){
        
        // minimum code to make test pass temporarily
        // int[] newArray = {9,5,1,4,7};
        
        int[] newArray = {};
                
        int count = 0;
        for(int index = 0; index < array.length; index++){

            for(int indexAt = index + 1; indexAt < newArray.length; indexAt++){
            
                if(array[index] == array[indexAt]){

                    newArray[index] = array[index];
                    
                    for(int id = 0; id < newArray.length; id++){
                        newArray[id] = array[index];
                    }
                    count += 1;
                }
                
                else break;
            }
                
        }
        
        return newArray;
    }
    
    
    // public static int[] getHighestLowestRange(int[] array){
        
    //     int[] newArray = {};
        
    //     int count = 0;
    //     int lowest = 0;
    //     int highest = 0;
        
    //     int[] array = {5,6,7,8,9,10,11,12,13,14};
        
    //     for(int index = 0; index < array.length; index++){
        
    //         System.out.println(array[index]);
        
    //         for(int indexAt = index+1; indexAt < array.length; indexAt++){
            
    //             if(array[index] > array[indexAt]){
    //                 lowest = array(index);
    //             }
    //             if(array[index] > array[indexAt]){
    //                 highest = array(index);
    //             }
    //             count++;
    //         }
        
    //     }
        
    //     return newArray;
    // }

}



// my checklist
// test has passed number one with a minimum code as intended
// test has failed again with required code written.. It seems as though it would do fine, but something in my method isn't right

