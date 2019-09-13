import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {

    Fizzbuzz fizzbuzz;

    @Before
    public void setup() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void printFizzFor3() {
        int input = 3;
        assertEquals("Fizz", fizzbuzz.play(input));
    }

    @Test
    public void printFizzForMulitples3() {
        int input = 6;
        assertEquals("Fizz", fizzbuzz.play(input));
    }

    @Test
    public void printNumberForNonMulitple3() {
        int input = 7;
        assertEquals("7", fizzbuzz.play(input));
    }

    @Test
    public void printBuzzFor5(){
        int input = 5;
        assertEquals("Buzz", fizzbuzz.play(input));
    }

    @Test
    public void printBUzzForMultiples5() {
        int input = 10;
        assertEquals("Buzz", fizzbuzz.play(input));
    }

    @Test
    public void printFizzBuzzFor3And5() {
        int input = 15;
        assertEquals("FizzBuzz", fizzbuzz.play(input));
    }



}