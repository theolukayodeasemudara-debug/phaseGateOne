        for(int index = 0; index < array.length; index++){

            for(int indexAt = index + 1; indexAt < newArray.length; indexAt++){
            
                if(array[index] + array[indexAt] = number){
                
                    newArray[count] = array[indexAt];
                    count += 1;
                    
                    newArray[count] = array[index];
                }
                
                else continue;
            }
                
        }
        
        return newArray;


