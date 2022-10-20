package com.unai.pccomponentes;

public class DVDwriter {

    private Integer id;
    private String fabricante;
    private String marca;
    private String velocidad_escritura;

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

    public String getVelocidad_escritura(){
        return velocidad_escritura;
    }

    public void setVelocidad_escritura(String velocidad_escritura){
        this.velocidad_escritura=velocidad_escritura;
    }


}
