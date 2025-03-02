import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
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

        for(int i = 0; i < tableau.size(); i++) {
            System.out.println(fizzBuzz.convert((Integer) tableau.get(i)));
        }

    }

}
