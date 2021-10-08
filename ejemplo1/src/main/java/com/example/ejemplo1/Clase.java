package com.example.ejemplo1;

public class Clase {
    private long fecha;
    private String nombre;

    public Clase(long fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
