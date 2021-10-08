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

    //En clase Login, crea un método que reciba como parámetro otro objeto de clase
    //Login y devuelva true si este objeto representa una conexión de un usuario que se
    //ha conectado en una fecha posterior al la conexión del usuario representada por el
    //objeto desde el que se invoca el método. Comprueba que funciona correctamente,
    //comprobando desde la clase Programa que la primera conexión del usuario arcano
    //ha sido en una fecha posterior a la primera conexión del usuario tudela

    public boolean conexionPosterior(Clase otro){
        if(otro.fecha > this.fecha){
            return true;
        } return false;
    }
}
