package com.example.formulariobackend.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "usuario")
public class Usuario {
    @Id
    private Long dni; // en form que solo se puedan ingresar numeros
    private String nombre;
    private String apellido;
    private String email;
    private String tipousuario;
    private int legajo; // que solo se puedan ingresar numeros
    private int telefono; // hacer que en el form solo se puedan ingresar numeros

    

    public Usuario(Long dni, String nombre, String apellido, String email, String tipousuario, int legajo,
            int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipousuario = tipousuario;
        this.legajo = legajo;
        this.telefono = telefono;
    }

    public Long getDni() {
        return dni;
    }
    public void setDni(Long dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipousuario() {
        return tipousuario;
    }
    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}