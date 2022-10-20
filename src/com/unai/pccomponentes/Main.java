package com.unai.pccomponentes;

import java.io.PipedWriter;

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

        Harddisk toshiba = new Harddisk();
        toshiba.setId(1);
        toshiba.setFabricante("toshiba");
        toshiba.setMarca("MG Series");
        toshiba.setCapacidad("16TB");

        System.out.println(toshiba.getMarca());
        System.out.println(toshiba.getFabricante());
        System.out.println(toshiba.getCapacidad());
        System.out.println(toshiba.getId());

        Powersupply nfortec = new Powersupply();
        nfortec.setId(1);
        nfortec.setFabricante("Nfortec");
        nfortec.setMarca("Vanth");
        nfortec.setPotencia("650W");

        System.out.println(nfortec.getMarca());
        System.out.println(nfortec.getFabricante());
        System.out.println(nfortec.getPotencia());
        System.out.println(nfortec.getId());

        SoundCard asus = new SoundCard();
        asus.setId(1);
        asus.setFabricante("Asus");
        asus.setMarca("Sonar SE Interno");
        asus.setCalidad_sonido("116dB");

        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getCalidad_sonido());
        System.out.println(asus.getId());

        DVDwriter lg = new DVDwriter();
        lg.setId(1);
        lg.setFabricante("Asus");
        lg.setMarca("DRW24");
        lg.setVelocidad_escritura("16x");

        System.out.println(lg.getMarca());
        System.out.println(lg.getFabricante());
        System.out.println(lg.getVelocidad_escritura());
        System.out.println(lg.getId());

    }
}