import random

secret_num = random.randint(1, 100)


count = 0;

while(True):
    count+=1
    guess_num = int(input("guess a number: "))
    
    
    # checking whether guess_number matches random number
    if guess_num > 100:
        print("engineer please abort!!!");
    
    if guess_num > secret_num:
        print("higher");
    elif guess_num < secret_num:
        print("lower");
    elif secret_num == guess_num:
        print("correct!!!");
        break;
     
    if count == 5:
        print("maximum tries exceeded");
        print(secret_num)
        print(f"{count} no of tries, secrete number is {secret_num}")
        break;


    # player expertise checker
    if guess_num == secret_num & count == 1:
        print("legendary!!!")
