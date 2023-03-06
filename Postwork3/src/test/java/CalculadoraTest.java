import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest2 {
        @TestFactory
        Stream<DynamicTest> dynamicTests() {

            Calculadora calculadora = new Calculadora();
            int number = 2;

            List<Integer> inputs = IntStream.range(0, 1000).boxed().toList();
            List<Integer> outputs = IntStream.range(0, 1000).map(n -> n + number).boxed().toList();

            return inputs.stream()
               .map( data -> DynamicTest.dynamicTest("Sum " + number + "+" + data + "= " + (data + number),
                      () -> {
                          assertEquals(calculadora.suma(data, 2), outputs.get(data));
                      }));
        }

}
