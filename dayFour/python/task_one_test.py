from unittest import TestCase

import task_one

class task_one_test(TestCase):
    
    def test_Method_Gets_Array_And_Int_Then_Returns_Array(self):
        
        // Arrange
        array = [8,8,12,4,-2];
        number = 6;
            
        expectedResult = [8,-2];
            
        // Act
        actualResult = task_one.getArrayInt(array, number);
            
        // Assert
        self.assertArrayEquals(expectedResult, expectedResult);
