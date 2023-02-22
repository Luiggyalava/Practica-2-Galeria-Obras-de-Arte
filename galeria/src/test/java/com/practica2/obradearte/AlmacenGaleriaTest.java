package com.practica2.obradearte;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AlmacenGaleriaTest {
    ObraDeArte cuadro;
    ObraDeArte escultura;
    AlmacenGaleria almacen;
    int opcion = 1, id = 2, piezas = 5;
    String nombre = "afds", autor = "aaaa", tipo = "Cuadro", descripcion = "aaaa", tecnicaOMaterial = "cuadro";
    double precio = 500, altura = 5, peso = 2;

    @BeforeEach
    void crearNuevaObra() {
        cuadro = new Cuadro(1, "cuadro1", "Paco", "Cuadro", 500, 3.5, 2, 6, "Cuadro nuevo artista", "oleo");
        escultura = new Escultura(2, "escultura1", "pepe", "Escultura", 400, 5, 6, 6, "Cuadro nuevo artista 2",
                "madera");
        almacen = new AlmacenGaleria();

    }

    @AfterEach
    void borrarObras() {
        cuadro = null;
        escultura = null;
    }

}
