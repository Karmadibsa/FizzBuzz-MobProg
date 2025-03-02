import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1WhenGiven1() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(1);

        // Assert
        assertEquals("1", result);
    }

    @Test
    public void shouldReturnFizzWhenGiven3() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(3);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizzWhenGiven6() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(6);

        // Assert
        assertEquals("Fizz", result);
    }
    @Test
    public void shouldReturnBuzzWhenGiven5() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(5);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGiven10() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(10);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenGiven15() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.convert(15);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnArray() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        ArrayList tableau = fizzBuzz.initArray(100);

        String[] baseFizzBuzz = {
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
                "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
                "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
                "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
                "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
                "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"
        };

        for(int i = 0; i < tableau.size(); i++) {
            String result = fizzBuzz.convert((Integer) tableau.get(i));
            String expectedResult = baseFizzBuzz[i];
            assertEquals(expectedResult, result);
        }
            }
        }
