package com.example.demoexamen.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="alumno")
public class alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String telefono;
   

    
    public alumno() {
    }


    public alumno(int id, String nombre, String telefono) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}


