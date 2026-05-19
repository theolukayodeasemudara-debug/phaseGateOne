// create a method that collect user's name from the terminal
// return message that says welcome user

const prompt = require("prompt-sync")()

let name = prompt("enter your name: ")
        
console.log(`welcome to day two ${name}`);
