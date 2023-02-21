package com.practica2.obradearte;

public class ObraDeArte {
    // atributos

    private int id;
    private String nombre;
    private String autor;
    private String tipo;
    private double precio;
    private double alturametros;
    private double pesoToneladas;
    private int numeropiezas;
    private String descripcion;

    // constructor
    public ObraDeArte(int id, String nombre, String autor, String tipo, double precio, double alturametros,
            double pesotoneladas, int numeropiezas, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.precio = precio;
        this.alturametros = alturametros;
        this.pesoToneladas = pesotoneladas;
        this.numeropiezas = numeropiezas;
        this.descripcion = descripcion;
    }

    // metodos
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAlturametros() {
        return this.alturametros;
    }

    public void setAlturametros(double alturametros) {
        this.alturametros = alturametros;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoToneladas() {
        return this.pesoToneladas;
    }

    public void setPesoToneladas(double pesotoneladas) {
        this.pesoToneladas = pesotoneladas;
    }

    public int getNumeropiezas() {
        return this.numeropiezas;
    }

    public void setNumeropiezas(int numeropiezas) {
        this.numeropiezas = numeropiezas;
    }

    // formato para ver una obras
    public String verUnaObraToString() {
        return "\n" + "Id: " + this.id + "\n" + "Tipo: " + this.tipo + "\n" + "Nombre: " + this.nombre + "\n"
                + "Autor: " + this.autor + "\n" + "Precio" + this.precio + "\n" + "Altura" + this.alturametros +
                "\n" + "Peso: " + this.pesoToneladas + "\n" + "Numero de Piezas: " + this.numeropiezas +
                "\n" + "Descripcion: " + this.descripcion;
    }

    // formato para ver solo Id y nombre
    public String verIdYNombreToString() {
        return this.id + " " + this.nombre;
    }

    // formato para imprimir visor de Etiqueta
    public String imprimirEtiquetaToString() {
        return "\nNombre: " + this.nombre + "\nAutor: " + this.autor + "\nDescripcion: " + this.descripcion;
    }

    // calcular Precio por Peso
    public double calcularPrecioPeso() {
        if (this.pesoToneladas > 1) {
            final int PRECIO_PESO_MAYOR = 100;
            return PRECIO_PESO_MAYOR;
        } else {
            final int PRECIO_PESO_MENOR = 20;
            return PRECIO_PESO_MENOR;
        }
    }// cierre calcpreciotneladas

    // calcular Precio Altura
    public double calcularPrecioAltura() {
        if (this.alturametros > 2) {
            final int PRECIO_ALTURA_MAYOR = 100;
            return PRECIO_ALTURA_MAYOR;
        } else {
            final int PRECIO_ALTURA_MENOR = 20;
            return PRECIO_ALTURA_MENOR;
        }
    }// cierre calcprecioaltura

    // calcular el precio de pieza Extra
    public double calcularPrecioPiezas() {
        int piezastemp = this.numeropiezas;
        double precioAdicional = 0;
        while (piezastemp != 2) {
            final int PRECIO_POR_PIEZA = 10;
            precioAdicional += PRECIO_POR_PIEZA;
            piezastemp--;
        }
        return precioAdicional;
    }// cierre calcpreciopiezas

    // calcular comision de Escultura
    public double comisionGaleria() {
        double comision = this.precio * 0.25;
        return comision;
    }
    // calcular descuento de Cuadro

    public double descPrecioCuadro() {
        double descuento = this.precio * 0.10;
        return descuento;
    }

    // calcular descuento de Escultura
    public double descPrecioEscultura() {
        final int MANIPULACION = 50;
        double descuento = this.precio * 0.20;
        descuento += MANIPULACION;
        return descuento;
    }

}