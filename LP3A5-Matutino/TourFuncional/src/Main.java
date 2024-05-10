
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Person> db =
                Stream.of(new Person("Rui", 80, 60., 1.70),
                        new Person("Eva", 25, 90., 1.82),
                        new Person("Ivo", 25, 49., 1.67),
                        new Person("Oto", 48, 100., 1.79)
                );

//      Quantas pessoas tem mais de 1,75 de altura?
    List<Person> countHeight = db
            .filter( w -> w.height >= 1.75)
            .toList();

        for (Person p : countHeight) {
                System.out.println(p.name);
                }

//      Quantas pessoas tem o IMC menor que 25?
        long countIMC = db
                .map(p -> p.weight / (p.weight * p.height))
                .filter(x -> x < 25.)
                .count();
        System.out.println(countIMC + " pessoas.");

//      Quantas pessoas tem "o" no nome?
        long countO = db
                .filter( p -> p.name.contains("oO"))
                .count();
        System.out.println(countO + " pessoas.");
        return;
    }
}

/**
     public class Main {
         public static void main(String[] args) {
    //       Stream demo
             List<String> datasource = new ArrayList<>();

             datasource.add("o");
             datasource.add("mar");
             datasource.add("não");
             datasource.add("te");
             datasource.add("magoa");
             datasource.add("e");
             datasource.add("não");
             datasource.add("ri");

 //          Quantas palavras diferentes com 3 ou mais letras
             long count = datasource.stream()
             .distinct()
             .filter( w -> w.length() >= 3 )
             .count();

             System.out.println(count);
         }
     }
 * */

/**
     public class Main {
        @FunctionalInterface
        interface Converter <T, R> {
        R apply(T source);
        }

        public static void main(String[] args) {
        //  Converter<String, Boolean> str2bool = s -> Boolean.parseBoolean(s);
            Converter<String, Boolean> str2bool = Boolean::parseBoolean;
            System.out.println(str2bool.apply("TRUE"));
            System.out.println(str2bool.apply("FALSE"));
            System.out.println(str2bool.apply("TruE"));
            System.out.println(str2bool.apply(null));
        }
    }
 * */

// -------------------------------------------------------------------------------

/**
 * Funções de ordem superior são funções que recebem e retonam funções - LAMBDAS!
 *  - Armazenadas em vars
 *  - Passadas como param
 *  - Retorno de outras funções
 * */

// -------------------------------------------------------------------------------

/**
 * Exemplos de Lambdas
 *
 * Exemplo 1
 * (Integer x, Integer y) -> {
 *     if(x > y) {
 *         return x;
 *     } else {
 *         return y;
 *     }
 * }
 *
 * Exemplo 1.1 - simplificando
 * (x, y) -> { return (x > y ? x : y) }
 *
 * Exemplo 1.2 - simplificando mais ainda ( sem parênteses e return )
 * (x, y) -> (x > y ? x : y)
 *
 * --------------------------------------------------------------------------
 *
 * Exemplo 2
 * (Integer x) -> { return Integer.toString(x) }
 *
 * Exemplo 2.1
 * (x) -> Integer.toString(x)
 *
 * Exemplo 2.2
 *
 *
 * */

