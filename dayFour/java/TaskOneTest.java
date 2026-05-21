import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskOneTest{

    @Test
    public void test_Method_Gets_Array_And_Int_Then_Returns_ArrayOne(){
        
        // Arrange
        int[] array = {8,8,12,4,-2};
        int number = 6;
            
        int[] expectedResult = {8,-2};
            
        // Act
        int[] actualResult = TaskOne.getArrayInt(array, number);
            
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void test_Method_Removes_Duplicates_Returns_New_Array(){
        
        // Arrange
        int[] array = {9,5,1,9,4,5,1,7};
        int[] expectedResult = {9,5,1,4,7};
        
        // Act
        int[] actualResult = TaskOne.removeDuplicates(array);
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void test_Method_Gets_Highest_And_Lowest_Returns_Array_With_Range_Between_Them(){
        
        // Arrange
        int[] array = {14,9,6,5,8,10};
        int[] expectedResult = {5,6,7,8,9,10,11,12,13,14};
        
        // Act
        int[] actualResult = TaskOne.getHighestLowestRange(array);
        
        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    // @Test
    // public void test_Method_Gets_Vowel_Consonants(){
        
    //     // Arrange
    //     String[] words = {"pie", "fly", "rat"};
    //     String[][] expectedResult = {
    //     {"fly"},
    //     {"pie", "rat"}
    //     };
        
        
    //     // Act
    //     String[] actualResult = TaskOne.getHighestLowestRange(words);
        
    //     // Assert
    //     assertArrayEquals(expectedResult, actualResult);
    // }
}




// javac -cp "junit-platform-console-standalone-1.11.0.jar" TestFile.java CodeFile.java
// java -jar junit-platform-console-standalone-1.11.0.jar --class-path . --select-class TestFile
