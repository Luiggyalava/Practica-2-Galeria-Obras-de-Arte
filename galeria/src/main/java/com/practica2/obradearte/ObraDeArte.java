package com.practica2.obradearte;

public class ObraDeArte {
    // atributos
    private int id;
    private String nombre;
    private String autor;
    private double precio;
    private double alturametros;
    private String descripcion;
    private double pesotoneladas;
    private int numeropiezas;

    // constructor
    public ObraDeArte(int id, String nombre, String autor, double precio, double alturametros, String descripcion,
            double pesotoneladas, int numeropiezas) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.alturametros = alturametros;
        this.descripcion = descripcion;
        this.pesotoneladas = pesotoneladas;
        this.numeropiezas = numeropiezas;
    }

    // metodo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAlturametros() {
        return alturametros;
    }

    public void setAlturametros(double alturametros) {
        this.alturametros = alturametros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesotoneladas() {
        return pesotoneladas;
    }

    public void setPesotoneladas(double pesotoneladas) {
        this.pesotoneladas = pesotoneladas;
    }

    public int getNumeropiezas() {
        return numeropiezas;
    }

    public void setNumeropiezas(int numeropiezas) {
        this.numeropiezas = numeropiezas;
    }

}
