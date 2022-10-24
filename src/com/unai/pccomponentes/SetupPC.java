package com.unai.pccomponentes;

import java.util.ArrayList;
import java.util.List;

public class SetupPC {
    private String id;
    private Procesador procesador;
    private MotherBoard motherBoard;
    private List<RAM> rams = new ArrayList<>();

    public void setId(String id){
        this.id = id;
    }
    public void setProcesador(Procesador procesador){
        this.procesador=procesador;
    }
    public void setMotherBoard(MotherBoard motherBoard){
        this.motherBoard=motherBoard;
    }
    public void addId()

}
