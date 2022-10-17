package com.unai.pccomponentes;

public class GraphicCard {

    private Integer id;
    private String marca;
    private String fabricante;
    private String memoria;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getMemoria(){
        return memoria;
    }

    public void setMemoria(String memoria){
        this.memoria = memoria;
    }
}
