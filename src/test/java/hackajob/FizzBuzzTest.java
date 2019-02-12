package hackajob;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class FizzBuzzTest {

    @Test
    public void run() {
        String sequence = FizzBuzz.run(1, 16);
        assertThat(sequence, is("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16"));
    }
}