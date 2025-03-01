import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
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
}
