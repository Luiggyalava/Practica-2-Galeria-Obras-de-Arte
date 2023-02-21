package com.practica2.obradearte;

public class AlmacenGaleria {

    // Crear las 5 primeras obras de Arte a mostrar
    public static Cuadro cuadro1 = new Cuadro(1, "Guernica", "P.Picaso", "Cuadro", 1000, 5, 2, 5, "Cuadro Guerra Civil",
            "Oleo");
    public static Cuadro cuadro2 = new Cuadro(2, "La Vie", "P.Picaso", "Cuadro", 200, 1, 1, 1, "Cuadro oleo", "Oleo");
    public static Cuadro cuadro3 = new Cuadro(3, "El Sueño", "Picaso", "Cuadro", 300, 1.3, 1, 1, "Cuadro oleo", "Oleo");
    public static Cuadro cuadro4 = new Cuadro(4, "Retrato de Dora Maar", "Picaso", "Cuadro", 400, 1, 0.8, 1,
            "Cuadro oleo", "Oleo");
    public static Escultura escultura1 = new Escultura(5, "El piel Roja", "U.Checa", "Escultura", 350, 1, 0.8, 1,
            "Escultura", "Piedra");

    // array para guardar las obras iniciales
    public static ObraDeArte[] almacenObras = { cuadro1, cuadro2, cuadro3, cuadro4, escultura1 };

}