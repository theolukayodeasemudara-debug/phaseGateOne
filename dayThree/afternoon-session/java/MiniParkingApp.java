public class MiniParkingApp{
    
    public static int[] garrageSize(int[] size){
    
        return size;
    }
    
    public static int[] getParkingSpace(int[] space){
        space[5] = 1;
        
        return space;
    }

    public static void main(String[] args){
    
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        
        int[] parkingSpace = new int[20];
        
        while(true){
        
        System.out.print("""
======== Mini Parking Garage ========
                
1. Park your carPark
2. Remove your car
3. Display free spaces you can park
4. Exit
            
            """);
            
            System.out.println("Enter an option to get started");
            
            int userOption = inputCollector.nextInt();
            
            switch(userOption){
                case 1:
                    for(int index = 0; index < parkingSpace.length; index++){
                        if(parkingSpace[index] == 0){
                            parkingSpace[index] = userOption;
                            System.out.println("car parked at slot" + (index += 1));
                        }
                    }
                    
                case 2:
                    for(int index = 0; index < parkingSpace.length; index++){
                        if(parkingSpace[index] == 0){
                            parkingSpace[index] = userOption;
                            System.out.println("car parked at slot" + (index += 1));
                        }
                    }                   
                
            }
            
            // System.out.print(parkingSpace[0]);
        }
        
        
    }
}
