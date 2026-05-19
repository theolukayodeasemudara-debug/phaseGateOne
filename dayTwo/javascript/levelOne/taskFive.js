// collect temperature from user
// convert it to Fahrenheit using formula (c * 9/5) + 32
const prompt = require("prompt-sync")()

let celsius = Number(prompt("enter celsius value: "));
        
let fahrenheit = (celsius * 9/5) + 32;
        
console.log("fahrenheit: ", fahrenheit);

