const prompt = require("prompt-sync")()
let number = Number(prompt('enter number: '))

for(index = 1;index <= number; index++){
    console.log(index + " X " + number + " = " + index*number);
}
