
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    private int id_mascota;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atEspecial;
    private String observaciones;
    @OneToOne
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre, String raza, String color, String alergico, String atEspecial, String observaciones, Duenio duenio) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atEspecial = atEspecial;
        this.observaciones = observaciones;
        this.duenio = duenio;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergicoa) {
        this.alergico = alergicoa;
    }

    public String getAtEspecial() {
        return atEspecial;
    }

    public void setAtEspecial(String atEspecial) {
        this.atEspecial = atEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
}
