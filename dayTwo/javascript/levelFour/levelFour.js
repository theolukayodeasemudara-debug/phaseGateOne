const addNumbers = function(num1, num2){
        console.log(num1 + num2);
}
    
const isEven = function(num){
    if(num % 2 == 0){
        console.log("number is even");
    }
}

  
const squareRoot = function(num){
    return num * num;
}
    
const fahrenheitConverter = function(celsius){
     fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
}
    
const primeChecker = function(num){
        
    for(index = 2; index <= num/index; index++){
            
        // if(number % index == 0){
                
        // }
    }
    return true;
}
    
const largestChecker = function(num1, num2, num3){
    
    if(num1 > num2 && num1 > num3){
        console.log(`${num1} is the largest` );
    }
    if(num2 > num1 && num2 > num3){
        console.log(`${num2} is the largest` );
    }
    if(num3 > num1 && num3 > num2){
        console.log(`${num3} is the largest` );
    }
}
    
    
const simpleerest = function(principal, rate, time){
        console.log((principal * rate * time)/ 100);
    }
    
const areaOfRectangle = function(length, breadth){
        console.log(length * breadth);
    }
    
    
// reversed = 0;
// digit = 0;
// const reverseNum = function(number){
//     digit = number % 10;
//     reversed = reversed * 100 + digit;
//     number/= 10;
        
//     return reversed;
// }


    addNumbers(2,4);
        
    isEven(10);
        
    console.log(squareRoot(2));
        
    console.log(fahrenheitConverter(100));
        
    console.log(primeChecker(10));
        
    largestChecker(10,12,11);
        
    simpleerest(5000, 5, 20.00);
        
    areaOfRectangle(20, 5);
        
    // console.log(reverseNum(12345));
