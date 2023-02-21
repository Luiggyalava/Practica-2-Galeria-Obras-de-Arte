package com.practica2.obradearte;

public class Escultura extends ObraDeArte {

    // atributo
    private String material;

    // Constructor
    public Escultura(int id, String nombre, String autor, String tipo, double precio, double alturametros,
            double pesotoneladas, int numeropiezas, String descripcion, String material) {
        super(id, nombre, autor, tipo, precio, alturametros, pesotoneladas, numeropiezas, descripcion);
        this.material = material;
    }
    // metodos

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
