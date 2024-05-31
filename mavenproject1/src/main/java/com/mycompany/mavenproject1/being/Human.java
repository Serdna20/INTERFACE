package com.mycompany.mavenproject1.being;

// PRIMERO SE HEREDA Y LUEGO SE IMPLEMENTA SOLO SE PUEDE HEREDAR UNA COSA
public class Human extends Being implements Move, Fly {
    private int height;
    private String name;

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    // Es necesario usar toooodos los métodos de la interfaz
    
    @Override
    public void walk() {
        System.out.println("Esta caminando erguido");
    }
            
    @Override
    public void run() {
        System.out.println("Corriendo como Naruto");
    }
    
    @Override
    public void fly() {
        System.out.println("Estoy volando");
    }

    @Override
    public void crawl() {
        System.out.println("Gateando");
    }
}
