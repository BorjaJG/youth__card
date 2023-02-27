package com.youthcard.domain.models;

public class Promocion {
    private Integer id;
    private String título;
    private String descripcion;
    private Integer descuento;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
}
