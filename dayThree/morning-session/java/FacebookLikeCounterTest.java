import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikeCounterTest{
    
    @Test
    public void testThatArrayHasZeroIndex(){
        
        // Arrange
        String[] names = {};
        
        
        // Act
        String actualResult = FacebookLikeCounter.checkEmptyArray(names);
        
        // Assert
        assertEquals(actualResult, "no one likes this");
    }
    
    
    @Test
    public void testThatArrayNowHasOneElementInIt(){
        
        // Arrange
        String[] names = {"olukayode"};
        int expectedResult = 1;
        
        // Act
        String[] actualResult = FacebookLikeCounter.addLikes(names);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
}


// javac -cp "junit-platform-console-standalone-1.11.0.jar" TestFile.java CodeFile.java
// java -jar junit-platform-console-standalone-1.11.0.jar --class-path . --select-class TestFile
