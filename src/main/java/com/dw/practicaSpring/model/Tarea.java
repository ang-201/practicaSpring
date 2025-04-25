package com.dw.practicaSpring.model;

public class Tarea {
    private int id;
    private String descripcion;
    private Boolean completada;

    public Tarea(int id, String descripcion, Boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
}
