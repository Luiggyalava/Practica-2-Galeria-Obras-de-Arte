package com.practica2.obradearte;

import java.util.Arrays;

public class AlmacenGaleria {
    private static final int UNO = 1;
    private static final int DOS = 2;

    // se crea obra vacia para que un metodo crearObras incluya las nuevas obras
    public static ObraDeArte obraNueva = null;

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

    // Poder ver las obras de arte Iniciales con el @Override
    public static void visualizarObras() {
        System.out
                .println("Id  \t\tNombre \t\tAutor \t\tTipo \t\tPrecio \tAltura(m)  \tPeso(t)  Npiezas \tDescripcion");
        for (ObraDeArte unaObraArte : almacenObras) {
            System.out.printf("%-3d   %-25s   %-10s   %-10s   %-10.2f   %-10.2f  %10.2f   %-8d   %s\n",
                    unaObraArte.getId(), unaObraArte.getNombre(), unaObraArte.getAutor(), unaObraArte.getTipo(),
                    unaObraArte.getPrecio(), unaObraArte.getAlturametros(), unaObraArte.getPesoToneladas(),
                    unaObraArte.getNumeropiezas(), unaObraArte.getDescripcion());
        } // cierre for
    }// cierre metodo

    // copia array con la obra nueva
    public static void copiarArrayMasObrasNueva() {
        if (obraNueva != null) {
            int nuevoTam = almacenObras.length + UNO;
            ObraDeArte[] nuevoAlmacen = Arrays.copyOf(almacenObras, nuevoTam);
            nuevoAlmacen[nuevoTam - UNO] = obraNueva;
            almacenObras = nuevoAlmacen;
        }
    }

    // crear obras de arte
    public ObraDeArte crearObras(int opcion, int id, String nombre, String autor, String tipo, double precio,
            double altura,
            double peso, int piezas, String descripcion, String tecnicaOMaterial) {

        if (opcion == UNO) {
            obraNueva = new Cuadro(id, nombre, autor, tipo, precio, altura,
                    peso, piezas, descripcion, tecnicaOMaterial);
            copiarArrayMasObrasNueva();
            obraNueva = null;

        } else if (opcion == DOS) {
            tipo = "Escultura";
            obraNueva = new Escultura(id, nombre, autor, tipo, precio, altura,
                    peso, piezas, descripcion, tecnicaOMaterial);
            copiarArrayMasObrasNueva();
            obraNueva = null;
        }
        return obraNueva;
    }// cierre crear Obras

}