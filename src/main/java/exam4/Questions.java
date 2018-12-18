package exam4;

import java.time.*;
import java.util.Properties;
import java.util.TreeSet;

public class Questions {

    public static void main(String[] args) {
        //question15();
        //question16();
        //question23();
        //question52();
        question57();
    }

    private static void question57() {
        Properties prop1 = new Properties();
        prop1.setProperty("a1", "1");
        prop1.setProperty("a2", "2");
        prop1.setProperty("a3", "3");

        System.out.println(prop1.contains("a1"));
        System.out.println(prop1.containsKey("2"));
        System.out.println(prop1.contains(1));
        System.out.println(prop1.getProperty("a1"));
    }

    private static void question52() {

//        List<Integer> list = Arrays.asList(2, 3, 4);
//        CyclicBarrier cb = new CyclicBarrier(2, new Callable<Integer>() {
//
//            @Override
//            public Integer call() throws Exception {
//                int sum = ((Integer) list.stream().mapToInt(i -> i).sum());
//                return sum;
//            }
//        });
    }

    private static void question23() {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(7);
        tree.add(1);
        tree.add(3);
        tree.add(5);
        System.out.println(tree.first());
        System.out.println(tree.last());

        for (int i : tree.tailSet(5)) {
            System.out.println(i);
        }
    }

    private static void question16() {

        ZonedDateTime.now(Clock.systemDefaultZone());
        ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("America/Los_Angeles"));
        ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Los_Angeles"));
        ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"));
    }

    private static void question15() {
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(11, 0);
        //LocalTime t = t2.minus(t1); // minus (java.time.temporal.TemporalAmount) in LocalTime cannot be applied
        LocalDate d1 = LocalDate.of(2016, 5, 31);
        LocalDateTime d3 = LocalDateTime.of(d1, t2);
        System.out.println(d3);
    }
}
