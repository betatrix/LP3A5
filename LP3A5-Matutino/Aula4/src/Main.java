import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static Integer funcaoPura(Integer i) {
        return (i%2==0) ? i * i : -11 * i;
    }

    static Optional funcaoImpura(Integer i) {
        if (i<0){
            return Optional.empty();
        } else {
            return Optional.of(funcaoPura(i));
        }
    }
    public static void main(String[] args) {
        List<String> source = List.of("rui", "eva", "oto", "ana", "ivo", "ari");
        Stream<String> db = source.stream();

        List<Integer> s2 = List.of(12, 3, 0, -1, 5, 4, 15, -2);

        IntStream nums = s2.stream().mapToInt(x -> x);
        int[] res1 = nums
                .map(Main::funcaoPura)
                .toArray();

        nums = s2.stream().mapToInt(x -> x);
        int[] res2 = nums
                .map(Main::funcaoPura)
                .map(Main::funcaoPura)
                .toArray();

        nums = s2.stream().mapToInt(x -> x);
        Object[] res3 = nums
                .mapToObj(x -> funcaoImpura(x))
                .toArray();

        System.out.println(res1[0]);
        System.out.println(res2[0]);
        System.out.println(res3[0]);

    Integer P = 2, I = 3, N =7;
    Integer fpP =  funcaoPura(P), fpI = funcaoPura(I), fpN = funcaoPura(N);
    Optional<Integer> fiP = funcaoImpura(P), fiI = funcaoImpura(I), fiN = funcaoImpura(N);
    Optional<Integer> t = fiP;
    Optional<Integer> Omapfp = t.map(Main::funcaoPura);
    Optional<Optional<Integer>> Omapfi = t.map(Main::funcaoImpura);
    Optional<Integer> Oflatfi = t.flatMap(Main::funcaoImpura);




//    nums = s2.stream().mapToInt(x -> x);
//    int[] res4 = nums
//            .flatMap(Main::funcaoImpura)
//            .toArray();

    }
}