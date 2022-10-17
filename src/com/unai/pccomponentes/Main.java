package com.unai.pccomponentes;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();
        /***
         * Código a ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());
        System.out.println(pentium.getId());


        MotherBoard gigabit= new MotherBoard();
        gigabit.setId(1);
        gigabit.setFabricante("gigabit");
        gigabit.setMarca("ATX864");
        gigabit.setForma("ATX");

        System.out.println(gigabit.getMarca());
        System.out.println(gigabit.getFabricante());
        System.out.println(gigabit.getForma());
        System.out.println(gigabit.getId());

        GraphicCard nvidia = new GraphicCard();
        nvidia.setId(1);
        nvidia.setFabricante("Nvidia");
        nvidia.setMarca("RTX4080");
        nvidia.setMemoria("32GB");

    }
}