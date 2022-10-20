package com.unai.pccomponentes;

public class Mouse {


    private Integer id;
    private String fabricante;
    private String marca;
    private String tpi;

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

    public String getTpi(){
        return tpi;
    }

    public void setTpi(String tpi){
        this.tpi=tpi;
    }

}
