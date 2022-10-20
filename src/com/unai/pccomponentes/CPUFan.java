package com.unai.pccomponentes;

public class CPUFan {

    private Integer id;
    private String fabricante;
    private String marca;
    private String rpm;

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

    public String getRpm(){
        return rpm;
    }

    public void setRpm(String rpm){
        this.rpm=rpm;
    }

}
