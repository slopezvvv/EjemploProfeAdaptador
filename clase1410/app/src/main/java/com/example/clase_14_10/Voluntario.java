package com.example.clase_14_10;

class Voluntario {
    private String rut;
    private String email;
    private String nombre;

    public Voluntario(String rut, String email, String nombre) {
        this.rut = rut;
        this.email = email;
        this.nombre = nombre;

    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
