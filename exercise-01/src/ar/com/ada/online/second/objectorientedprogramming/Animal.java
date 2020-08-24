package ar.com.ada.online.second.objectorientedprogramming;

public class Animal {
    //declaro los ATRIBUTOS
    String breed;
    String color;
    String name;

    //creo los metodos (Void es la palabra reservada para cuando no se retorna informacion)
    void move() {
        System.out.print("I'm running");
    }
    void sleep() {
        System.out.print("Zzz");
    }
    void eat() {
        System.out.print("I'm eating");
    }
}
