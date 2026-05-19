// Collect user's age from terminal
// Add 5 years to the user's age to predict how many years user will be in 5 years time
 
const prompt = require("prompt-sync")()    

let age = Number(prompt("enter your age: "))
        
console.log(`You will be ${age + 5} years in 5 years from now`);

