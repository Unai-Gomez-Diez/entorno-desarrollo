package com.unai.pccomponentes;

public class Powersupply {

    private Integer id;
    private String fabricante;
    private String marca;
    private String potencia;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getPotencia(){
        return potencia;
    }

    public void setPotencia(String potencia){
        this.potencia=potencia;
    }


}
