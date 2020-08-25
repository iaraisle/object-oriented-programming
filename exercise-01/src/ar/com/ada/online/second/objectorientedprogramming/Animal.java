package ar.com.ada.online.second.objectorientedprogramming;

public class Animal {
    //declaro los ATRIBUTOS
    String breed;
    String color;
    String name;

    //creo los metodos (Void es la palabra reservada para cuando no se retorna informacion)
    void move() {
        System.out.print("Estoy en movimiento");
    }
    void sleep() {
        System.out.print("Estoy durmiendo");
    }
    void eat() {
        System.out.print("Estoy comiendo");
    }
}
