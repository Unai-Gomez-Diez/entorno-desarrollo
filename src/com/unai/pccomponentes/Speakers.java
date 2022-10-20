package com.unai.pccomponentes;

public class Speakers {

    private Integer id;
    private String fabricante;
    private String marca;
    private String canales_salida;

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

    public String getCanales_salida(){
        return canales_salida;
    }

    public void setCanales_salida(String canales_salida){
        this.canales_salida=canales_salida;
    }


}
