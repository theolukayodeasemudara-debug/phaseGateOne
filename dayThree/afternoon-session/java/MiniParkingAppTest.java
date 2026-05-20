import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingAppTest{
    
    @Test
    public void test_That_Parking_Space_Length_Is_Equal_To_Twenty(){
        
        // Arrange
        int[] carPark = new int[20];
        int[] expectedResult = carPark;
        
        // Act
        int[] actualResult = MiniParkingApp.garrageSize(carPark);
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
        
    }
    
    @Test
    public void test_That_User_Chooses_Space_and_Replaces_Zero_Space(){
        
        // Arrange
        int[] carPark = new int[20];
        carPark[5] = 1;

        // Act
        int[] expectedResult = carPark;
        int[] actualResult = MiniParkingApp.getParkingSpace(carPark);
        
        // Assert
        assertArrayEquals(actualResult, expectedResult);
    }
    
}


// javac -cp "junit-platform-consolestandalone-1.11.0.jar:out" -d out MiniParkingAppTest.java MiniParkingApp.java
// java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
