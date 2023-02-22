package com.practica2.obradearte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObraDeArteTest {

    ObraDeArte cuadro;
    ObraDeArte escultura;

    @BeforeEach
    void crearNuevaObra() {
        cuadro = new Cuadro(1, "cuadro1", "Paco", "Cuadro", 500, 3.5, 2, 6, "Cuadro nuevo artista", "oleo");
        escultura = new Escultura(2, "escultura1", "pepe", "Escultura", 400, 5, 6, 6, "Cuadro nuevo artista 2",
                "madera");
    }

    @AfterEach
    void borrarObras() {
        cuadro = null;
        escultura = null;
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

    @Test
    public void calcularPrecioPiezas() {
        double expected = 40;
        assertEquals(expected, cuadro.calcularPrecioPiezas());
    }

    @Test
    public void calcularPrecioPeso() {
        double expected = 100;
        assertEquals(expected, cuadro.calcularPrecioPeso());
    }

    @Test
    public void calcularPrecioAltura() {
        double expected = 100;
        assertEquals(expected, cuadro.calcularPrecioAltura());
    }

    @Test
    public void calcularcomisionGaleria() {
        double expected = 125;
        assertEquals(expected, cuadro.comisionGaleria());
    }

    @Test
    public void calcularDescuentoCuadro() {
        double expected = 50;
        assertEquals(expected, cuadro.descPrecioCuadro());
    }

    @Test
    public void calcularDescuentoEscultura() {
        double expected = 130;
        assertEquals(expected, escultura.descPrecioEscultura());
    }

    @Test
    public void calcularPrecioCuadro() {
        double expected = 815;
        assertEquals(expected, cuadro.precioFinalCuadro());
    }

    @Test
    public void calcularPrecioEscultura() {
        double expected = 715;
        assertEquals(expected, cuadro.preciofinalEscultura());
    }

}
