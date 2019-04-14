package intenthq;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CyclicConnectedGraphTest {

    /*
     *
     * a2 <- a3
     *  |     |
     * a1 <-- +
     *  |
     *  +-> a4 <- a5
     *
     * */
    @Test
    public void shouldFindGraphConnectionsExample2() {

        CyclicConnectedGraph.Node a1 = new CyclicConnectedGraph.Node(1, new ArrayList<>());
        CyclicConnectedGraph.Node a2 = new CyclicConnectedGraph.Node(2, Collections.singletonList(a1));
        CyclicConnectedGraph.Node a3 = new CyclicConnectedGraph.Node(3, Collections.singletonList(a2));
        a1.addEdge(a3);

        CyclicConnectedGraph.Node a4 = new CyclicConnectedGraph.Node(4, new ArrayList<>());
        a1.addEdge(a4);

        CyclicConnectedGraph.Node a5 = new CyclicConnectedGraph.Node(5, Collections.singletonList(a4));

        assertThat(CyclicConnectedGraph.run(a1, a3), is(true));
        assertThat(CyclicConnectedGraph.run(a3, a2), is(true));
        assertThat(CyclicConnectedGraph.run(a2, a1), is(true));
        assertThat(CyclicConnectedGraph.run(a2, a3), is(true));
        assertThat(CyclicConnectedGraph.run(a2, a4), is(true));
        assertThat(CyclicConnectedGraph.run(a3, a4), is(true));
        assertThat(CyclicConnectedGraph.run(a1, a4), is(true));
        assertThat(CyclicConnectedGraph.run(a1, a5), is(false));
        assertThat(CyclicConnectedGraph.run(a5, a4), is(true));
        assertThat(CyclicConnectedGraph.run(a5, a1), is(false));
    }
}