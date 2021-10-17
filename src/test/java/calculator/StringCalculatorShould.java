package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_double_number_should_return_number_sum() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("2,3"));
    }
    
    @Test
    void testAddUnkownAmountOfNumbers(){
    	  StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("2,3,1"));
    }
    
    @Test
    void allowNewLine(){
    	  StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("2,3,1"));
    }
    
    @Test
    void AddWithNegativeNoShowExeption(){
    	  StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("-2,3,1"));
    }
    
    
   
}
