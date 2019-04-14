package intenthq;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConnectedGraphTest {

    @Test
    public void shouldFindGraphConnectionsExample1() {

        ConnectedGraph.Node ten = new ConnectedGraph.Node(10, Collections.emptyList());
        ConnectedGraph.Node nine = new ConnectedGraph.Node(9, Collections.emptyList());
        ConnectedGraph.Node two = new ConnectedGraph.Node(2, Collections.emptyList());
        ConnectedGraph.Node eight = new ConnectedGraph.Node(8, Collections.singletonList(nine));
        ConnectedGraph.Node three = new ConnectedGraph.Node(3, Arrays.asList(eight, ten));
        ConnectedGraph.Node eleven = new ConnectedGraph.Node(11, Arrays.asList(two, nine, ten));
        ConnectedGraph.Node seven = new ConnectedGraph.Node(7, Arrays.asList(eleven, eight));
        ConnectedGraph.Node five = new ConnectedGraph.Node(5, Collections.singletonList(eleven));

        assertThat(ConnectedGraph.run(ten, nine), is(false));
        assertThat(ConnectedGraph.run(three, ten), is(true));
        assertThat(ConnectedGraph.run(three, two), is(false));
        assertThat(ConnectedGraph.run(eight, ten), is(false));
        assertThat(ConnectedGraph.run(eight, nine), is(true));
        assertThat(ConnectedGraph.run(seven, two), is(true));
        assertThat(ConnectedGraph.run(three, nine), is(true));
        assertThat(ConnectedGraph.run(five, eleven), is(true));
        assertThat(ConnectedGraph.run(five, nine), is(true));
        assertThat(ConnectedGraph.run(five, two), is(true));
    }

    @Test
    public void shouldFindGraphConnectionsExample2() {

        // a1 -+-> b2 -> c3 -> e5
        //    |                |
        //    +-> d4 ->  f6 -> g7

        ConnectedGraph.Node g = new ConnectedGraph.Node(7);
        ConnectedGraph.Node f = new ConnectedGraph.Node(6, Collections.singletonList(g));
        ConnectedGraph.Node e = new ConnectedGraph.Node(5, Collections.singletonList(g));
        ConnectedGraph.Node c = new ConnectedGraph.Node(3, Collections.singletonList(e));
        ConnectedGraph.Node b = new ConnectedGraph.Node(2, Collections.singletonList(c));
        ConnectedGraph.Node d = new ConnectedGraph.Node(4);
        ConnectedGraph.Node a = new ConnectedGraph.Node(1, Arrays.asList(b, d));

        assertThat(ConnectedGraph.run(a, a), is(true));
        assertThat(ConnectedGraph.run(a, b), is(true));
        assertThat(ConnectedGraph.run(b, d), is(false));
        assertThat(ConnectedGraph.run(a, e), is(true));
        assertThat(ConnectedGraph.run(e, b), is(false));
        assertThat(ConnectedGraph.run(e, d), is(false));
        assertThat(ConnectedGraph.run(e, g), is(true));
        assertThat(ConnectedGraph.run(f, g), is(true));
        assertThat(ConnectedGraph.run(a, g), is(true));
        assertThat(ConnectedGraph.run(c, g), is(true));
    }
}