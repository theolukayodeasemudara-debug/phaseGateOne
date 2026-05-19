const prompt = require("prompt-sync")()
                
let number = Number(prompt("enter a number: "))
let sum = 0;

for(index = 1; index <= number; index++){
    sum += index;
}
    console.log(sum);

