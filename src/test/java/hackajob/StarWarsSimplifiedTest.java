package hackajob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarWarsSimplifiedTest {

    @Test
    public void testRun() {
        assertEquals(5, StarWarsSimplified.run("Luke Skywalker"));
        assertEquals(7, StarWarsSimplified.run("r2"));
        assertEquals(6, StarWarsSimplified.run("C-3PO"));
    }
}