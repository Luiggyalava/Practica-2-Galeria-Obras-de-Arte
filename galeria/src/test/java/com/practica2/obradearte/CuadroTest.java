package com.practica2.obradearte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadroTest {
    Cuadro cuadro;

    @BeforeEach
    void crearNuevaObra() {
        cuadro = new Cuadro(1, "cuadro1", "Paco", "Cuadro", 500, 3.5, 2, 6, "Cuadro nuevo artista", "oleo");
    }

    @AfterEach
    void borrarObras() {
        cuadro = null;
    }

    @Test
    public void devuelvePiezasCorrectas() {
        double expected = 6;
        assertEquals(expected, cuadro.getNumeropiezas());
    }

    @Test
    public void cambiarNumeroPiezas() {
        double expected = 7;
        int cambioPiezas = 7;
        cuadro.setNumeropiezas(cambioPiezas);
        assertEquals(expected, cuadro.getNumeropiezas());
    }

}
