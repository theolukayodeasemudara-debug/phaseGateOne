// collect number from the terminal using prompt-sync
// generate random number between 1 and 100

const prompt = require("prompt-sync")();

secretNum = Math.floor(Math.random() * 100 +1 );

count = 0;

while(true){
    count++;
    guessNum = Number(prompt("guess a number: "));
    
    
    if(guessNum > 100){
        console.log("engineer please abort!!!");
    }
    
     if(guessNum > secretNum){
         console.log("higher");
     } else if(guessNum < secretNum){
         console.log("lower");
     } else if(secretNum == guessNum){
         console.log("correct!!!");
         break;
     } 
     
     if(count == 5) {
         console.log("maximum tries exceeded");
         console.log(`${count} no of tries. Secrete number is ${secretNum}`)
         break;
     }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   // for(count = 1; count <= 5; count++){
   //     if(guessNum > secretNum){
   //         console.log("higher")
   //     } else if(guessNum < secretNum){
   //         console.log("lower")
   //     } else if(secretNum == guessNum){
   //         console.log("correct!!!")
   //     }
   // }
