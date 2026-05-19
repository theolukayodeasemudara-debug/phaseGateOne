// // collect length of rectangle from user
// collect breadth of rectangle from user
// area of rectangle is length * breadth
const prompt = require("prompt-sync")()

let length = Number(prompt("enter length of rectangle: "));
let breadth = Number(prompt("enter breadth of rectangle: "));
        
let area = length * breadth;
        
console.log(area);

