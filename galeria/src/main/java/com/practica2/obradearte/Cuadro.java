package com.practica2.obradearte;

public class Cuadro extends ObraDeArte {

    // atributos
    private String tecnica;

    // constructor
    public Cuadro(int id, String nombre, String autor, String tipo, double precio, double alturametros,
            double pesotoneladas, int numeropiezas, String descripcion, String tecnica) {
        super(id, nombre, autor, tipo, precio, alturametros, pesotoneladas, numeropiezas, descripcion);
        this.tecnica = tecnica;
    }

    // metodos
    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

}
