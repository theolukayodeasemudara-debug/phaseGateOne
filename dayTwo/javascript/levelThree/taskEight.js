const prompt = require("prompt-sync")()

let number;     
        
let sum = 0;
while(number != 0){
   number = Number(prompt("enter a number: "))   
             
    sum += number;       
}
console.log(sum);

