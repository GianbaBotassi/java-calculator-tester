import Model.Calculator;
import exceptions.DivideByZeroException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    @DisplayName("Controlla addizione")
    void add() {
        for (float i = 0; i < 100; i++) {
            for (float j = 0; j < 100; j++) {
                assertEquals(i + j, Calculator.add(i, j));
            }
        }
    }

    @Test
    @DisplayName("Controlla sottrazione")
    void substract() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
        assertEquals(i - j, Calculator.substract(i, j));
            }
        }
    }

    @Test
    @DisplayName("Controlla divisione")
    void divide() throws DivideByZeroException {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if( j == 0){
                    //Convertito in final le variabili perchè le lambda non accettano diversamente
                    int i2= i;
                    int j2 = j;
                    assertThrows(DivideByZeroException.class,()->{
                        Calculator.divide(i2,j2);
                    });
                }else{
                    //Bisogna castare in modo che siano numeri float
                assertEquals((float) i / j, Calculator.divide(i, j));
                }
            }
        }
    }

    @Test
    @DisplayName("Controlla moltiplicazione")
    void multiply() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                assertEquals(i * j, Calculator.multiply(i, j));
            }
        }
    }
}