package com.unai.pccomponentes;

public class BOX {

    private Integer id;
    private String fabricante;
    private String marca;
    private String placa_soportada;

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

    public String getPlaca_soportada(){
        return placa_soportada;
    }

    public void setPlaca_soportada(String placa_soportada){
        this.placa_soportada=placa_soportada;
    }

}
