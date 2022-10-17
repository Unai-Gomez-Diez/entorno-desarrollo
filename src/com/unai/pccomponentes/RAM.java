package com.unai.pccomponentes;

public class RAM {

    private Integer id;
    private String fabricante;
    private String marca;
    private String tipo;

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

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

}
