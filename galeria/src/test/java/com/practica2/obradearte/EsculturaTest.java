package com.practica2.obradearte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsculturaTest {
    Escultura escultura;

    @BeforeEach
    void crearNuevaObra() {
        escultura = new Escultura(1, "escultura1", "Paco", "Cuadro", 500, 3.5, 2, 6, "Cuadro nuevo artista", "oleo");
    }

    @AfterEach
    void borrarObras() {
        escultura = null;
    }

    @Test
    public void devuelvePrecioCorrectas() {
        double expected = 500;
        assertEquals(expected, escultura.getPrecio());
    }

    @Test
    public void cambiarNumeroPiezas() {
        double expected = 1000;
        int cambioPiezas = 1000;
        escultura.setPrecio(cambioPiezas);
        assertEquals(expected, escultura.getPrecio());
    }

}
