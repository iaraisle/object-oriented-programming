package ar.com.ada.online.second.objectorientedprogramming;

public class Vehicle {
    //declaro los ATRIBUTOS
    String brand;
    String color;
    Integer maxSpeed;

    //creo los metodos (Void es la palabra reservada para cuando no se retorna informacion)
    void moveOn() {
        System.out.print("I'm moving");
    }
    void brake() {
        System.out.print("I stoped");
    }
}
