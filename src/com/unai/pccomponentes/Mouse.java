package com.unai.pccomponentes;

public class Mouse {


    private Integer id;
    private String fabricante;
    private String marca;
    private String dpi;

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

    public String getDpi(){
        return dpi;
    }

    public void setDpi(String dpi){
        this.dpi=dpi;
    }

}
