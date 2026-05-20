
// create an array that collects strings of names
// user should enter string of name that would then be stored in the array
// if the array.length has an empty value, display "no one likes this"
// if array.length now has one value, display message "value likes this"
// array must always return a value, which is the display text


public class FacebookLikeCounter{

    public static String checkEmptyArray(String[] names){
        String message = "no one likes this";
        if(names.length == 0){      
            return message;
        }
        
        return " ";
    }
    

    public static int addLikes(String[] names){
        String message = "no one likes this";
        if(names.length == 0){      
            return message;
        }
        
        return 1;
    }
    
    



    public static void main(String[] args){
        
        // String[] facebookLikes = {"olukayode", "yemisi", "david", "ogechi"};
        String[] names = new String[0];
        System.out.println(names.length);
        
    }
}
