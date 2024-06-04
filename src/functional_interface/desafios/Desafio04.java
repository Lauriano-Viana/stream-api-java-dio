package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio04 {
    public static void main(String[] args) {
/*

    Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrd = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numerosOrd);


    }
}
