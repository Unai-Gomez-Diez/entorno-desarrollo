package com.unai.pccomponentes;

public class SoundCard {


    private Integer id;
    private String fabricante;
    private String marca;
    private String calidad_sonido;

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

    public String getCalidad_sonido(){
        return calidad_sonido;
    }

    public void setCalidad_sonido(String calidad_sonido){
        this.calidad_sonido=calidad_sonido;
    }

}
