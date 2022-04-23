package com.example.srn;

public class IsotoposVo {

    private Integer id;
    private String nombre;
    private String simbolo;
    private Integer z;
    private Integer a;
    private Integer m;


    public IsotoposVo(){

    }
    public IsotoposVo(Integer id, String nombre, String simbolo, Integer z, Integer a, Integer m) {
        this.id = id;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.z = z;
        this.a = a;
        this.m = m;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }
}

