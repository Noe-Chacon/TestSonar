package Tests;
import org.example.OperacionesMatematicas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {
    @Test
    void sumarTest(){
        OperacionesMatematicas sumando = new OperacionesMatematicas();
        Assertions.assertEquals(4, sumando.suma(2, 2));
    }
    @Test
    void RestaTest(){
        OperacionesMatematicas restando = new OperacionesMatematicas();
        assertEquals(2, restando.resta(4,2));
    }
    @Test
    void SumatoriaTest(){
        OperacionesMatematicas sumatoria = new OperacionesMatematicas();
        sumatoria.recorrido(1);
    }
}