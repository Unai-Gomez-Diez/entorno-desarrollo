package com.unai.pccomponentes;

public class Screen {


    private Integer id;
    private String fabricante;
    private String marca;
    private String hz;

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

    public String getHz(){
        return hz;
    }

    public void setHz(String hz){
        this.hz=hz;
    }

}
