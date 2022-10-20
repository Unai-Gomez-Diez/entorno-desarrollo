package com.unai.pccomponentes;

public class Keyboard {


    private Integer id;
    private String fabricante;
    private String marca;
    private String teclas;

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

    public String getTeclas(){
        return teclas;
    }

    public void setTeclas(String teclas){
        this.teclas=teclas;
    }

}
