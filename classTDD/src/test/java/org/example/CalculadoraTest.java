package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();
    @Test
    void unoMasUnoEsDos(){
        int expectedResult = 2;
        assertEquals(expectedResult, calc.suma(1, 1));
    }

    @Test
    void unoMasCeroEsMenorQueDos(){
        assertTrue(calc.suma(1,0)<2);
    }

    @Test
    void groupedAssertion(){
        assertAll("Pruebas varias",
                () -> assertEquals(2, calc.suma(1, 1)),
                () -> assertTrue(calc.suma(1,3)>2)
        );
    }

    @Test
    void exceptionTesting(){
        Exception exception = assertThrows(ArithmeticException.class, ()->calc.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void timeOutTest(){
        assertTimeout(Duration.ofMinutes(2),
                () -> calc.resta(10,2)
                );
    }

    @Test
    void checkSleep(){
        assertTimeout(Duration.ofMillis(100),
                () -> Thread.sleep(10)
                );
    }
}
