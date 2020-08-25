package ar.com.ada.online.second.objectorientedprogramming;

public class Person {
    //declaro los ATRIBUTOS
    String name;
    String lastName;
    Integer age;

    //creo los metodos (Void es la palabra reservada para cuando no se retorna informacion)
    void sing() {
        System.out.print("Estoy cantando");
    }
    void talk() {
        System.out.print("Estoy hablando");
    }
    void play() {
        System.out.print("Estoy jugando");
    }
}
