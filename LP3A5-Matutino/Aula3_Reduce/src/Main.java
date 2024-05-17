import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//      Reduce -----------------------------------------------------------------
        List<Integer> nums = List.of(3, 5, 9, 10, 8);

        IntStream s = nums.stream().mapToInt(x -> x);
        System.out.println(s.count());

        s = nums.stream().mapToInt(x -> x);
        System.out.println(s.sum());

        s = nums.stream().mapToInt(x -> x);
        int sum = s.reduce(0, ((x, y) -> x + y));
        System.out.println(sum);

        s = nums.stream().mapToInt(x -> x);
        int count = s.reduce(0, (x, y) -> x + 1);
        System.out.println(count);

        s = nums.stream().mapToInt(x -> x);
        int max = s.reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(max);

        Optional<Integer> treasure = Optional.of(42);
        Optional<Integer> bomb = Optional.empty();

        System.out.println(treasure.get());
        //System.out.println(bomb.get());
        System.out.println(treasure.orElse(-1000));
        System.out.println(bomb.orElse(-2000));

        IntStream es = IntStream.empty();
        Integer attempt1 = es.reduce(0, (x, y) -> x + y);
        System.out.println(attempt1);

        es = IntStream.empty();
        OptionalInt attempt2 = es.reduce((x, y) -> x + y);
        System.out.println(attempt2.orElse(-1));

        s = nums.stream().mapToInt(x -> x);
        System.out.println(s.reduce(Integer::sum).orElse(-2));

//      Collect -----------------------------------------------------------------
        s = nums.stream().mapToInt(x -> x);
        ArrayList<Integer> result = s.map(n -> n * 3 +19)
                .filter(n -> n%2 == 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        result.forEach(i -> System.out.print(i + ", "));
    }
}

//      Tipos algébricos  --------------------------------------------------------
    /**
     * Produto -> registros(struct), classes
     *
     * Soma -> ENUMS
     */
