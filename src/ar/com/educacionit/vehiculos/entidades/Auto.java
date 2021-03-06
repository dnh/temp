/*
 * Auto.java
 *
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public class Auto extends Vehiculo {

    /**
     * Creates a new instance of Auto
     */
    public Auto() {
    }

    public Auto(String marca, String modelo, String color, int largo, int ancho, int altura) {
        super(ancho, largo, altura);
        setMarca(marca);
        setModelo(modelo);
        setColor(color);
    }

    // Atributos
    private String marca;
    private String modelo;
    private String color;

    public String toString() {
        return marca + " " + modelo + " " + color + " [" + super.toString() + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
