import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @TestFactory
    @DisplayName("Suma tests")
    Stream<DynamicTest> suma() {
        Calculadora calculadora = new Calculadora();

        List<Integer> lista1 = IntStream.range(0,1000).boxed().collect(Collectors.toList());
        List<Integer> lista2 = IntStream.range(0,1000).map(x -> x+1).boxed().collect(Collectors.toList());
        List<Integer> waiting = IntStream.range(0,1000).map(x -> (2*x)+1).boxed().collect(Collectors.toList());

        return lista1.stream()
                .map(x -> DynamicTest.dynamicTest("Suma de: " + x + " + " + lista2.get(x),
                        () -> {
                            assertEquals(waiting.get(x), calculadora.suma(x, lista2.get(x)));
                        }));
    }
}