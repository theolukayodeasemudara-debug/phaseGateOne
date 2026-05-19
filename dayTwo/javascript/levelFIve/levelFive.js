const replaceNegNumbers = function(numbers){
         for(let index = 0; index < numbers.length; index++){
             if(numbers[index] < 0){
                 numbers[index] = 0;
             }
             console.log(numbers[index] + " ");
         }
    }
    

// const changeZeroPositions = function(numbers){
//     for(let index = 0; index < numbers.length; index++){
//         if(numbers[index] == 0){
//             numbers[index];
//         }
//         console.log(numbers[index] + " ");
//     }
// }
    
    
myArray = [-1,-2,-3,-4,5,1,6,7];
replaceNegNumbers(myArray);

