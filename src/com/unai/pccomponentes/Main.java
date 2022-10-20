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

        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getFabricante());
        System.out.println(nvidia.getMemoria());
        System.out.println(nvidia.getId());

       RAM corsair = new RAM();
        corsair.setId(1);
        corsair.setFabricante("Corsair");
        corsair.setMarca("DDR4 3200");
        corsair.setTipo("DDR4");

        System.out.println(corsair.getMarca());
        System.out.println(corsair.getFabricante());
        System.out.println(corsair.getTipo());
        System.out.println(corsair.getId());

        BOX tempest = new BOX();
        tempest.setId(1);
        tempest.setFabricante("Tempest");
        tempest.setMarca("Start torre");
       tempest.setPlaca_soportada("ATX");

        System.out.println(tempest.getMarca());
        System.out.println(tempest.getFabricante());
        System.out.println(tempest.getPlaca_soportada());
        System.out.println(tempest.getId());

        CPUFan zalman = new CPUFan();
        zalman.setId(1);
        zalman.setFabricante("Zalman");
        zalman.setMarca("CNPS9900");
        zalman.setRpm("1400rpm");

        System.out.println(zalman.getMarca());
        System.out.println(zalman.getFabricante());
        System.out.println(zalman.getRpm());
        System.out.println(zalman.getId());
    }
}