const prompt = require("prompt-sync")()
let number = Number(prompt("enter a number: "))

factorial = 1;

for(index = number;index >= 1; index--){
    factorial *= index;
}
    console.log(factorial);

