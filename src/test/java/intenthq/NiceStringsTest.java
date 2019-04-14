package intenthq;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static intenthq.NiceStrings.nice;
import static intenthq.NiceStrings.niceRegex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class NiceStringsTest {

    @Test
    public void shouldFindNiceStrings1() {

        List<String> stringsToInspect = new ArrayList<>(Arrays.asList(
                "ugknbfddgicrmopn",
                "jchzalrnumimnmhp",
                "haegwjzuvuyypxyu",
                "dvszwmarrgswjxmb"));

        assertThat(nice(stringsToInspect), is(1));
    }

    @Test
    public void shouldFindNiceStrings2() {

        List<String> stringsToInspect = new ArrayList<>(Arrays.asList(
                "fewarthyfgdwaetryt",
                "ety45uhtegefwt4yee5uthrfg",
                "ewt436y5wwhttrfegredfi",
                "ewrtrayhfgreyshtbf"));

        assertThat(nice(stringsToInspect), is(2));
    }

    @Test
    public void shouldFindNiceStrings3() {

        List<String> stringsToInspect = new ArrayList<>(Arrays.asList(
                "ugknbfddgicrmopn",
                "jchzalrnumimnmhp",
                "haegwjzuvuyypxyu",
                "dvszwmarrgswjxmb"));

        assertThat(niceRegex(stringsToInspect), is(1));
    }

    @Test
    public void shouldFindNiceStrings4() {

        List<String> stringsToInspect = new ArrayList<>(Arrays.asList(
                "fewarthyfgdwaetryt",
                "ety45uhtegefwt4yee5uthrfg",
                "ewt436y5wwhttrfegredfi",
                "ewrtrayhfgreyshtbf"));

        assertThat(niceRegex(stringsToInspect), is(2));
    }
}