const prompt = require("prompt-sync")()
        
let sum = 0;

for(index = 1; index <= 5; index++){
   let number = Number(prompt("enter a number: "))     
    sum += number;           
}
console.log(sum);

