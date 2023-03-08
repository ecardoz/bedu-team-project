import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    @TestFactory
    public Stream<DynamicTest> dynamicTestStream(){
        return Stream.iterate(0, n-> n+1).limit(1000)
                .map(n -> DynamicTest.dynamicTest("Test" + n, () ->{
                    int resultado = calculadora.suma(n,n);
                    assertEquals(n* 2, resultado);
                }));
    }

}