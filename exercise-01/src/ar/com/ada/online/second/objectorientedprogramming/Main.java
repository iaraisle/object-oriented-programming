package ar.com.ada.online.second.objectorientedprogramming;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal();
        Vehicle car = new Vehicle();
        Person iara = new Person();


        iara.name = "Iara";
        iara.lastName = "Isleño";
        iara.age = 29;

        car.brand = "Toyota";
        car.color = "Negro";
        car.maxSpeed = 300;


        cat.name = "Orion";
        cat.breed = "American shorthair";
        cat.color = "Orange";

        System.out.printf("Nombre: "+ iara.name+ " Apellido: "+ iara.lastName+ " Edad: "+ iara.age);
        iara.sing();
        System.out.println("\nMarca: "+ car.brand+ " Color: "+ car.color+ " Velocidad máxima: "+ car.maxSpeed+ "k/h");
        car.moveOn();
        System.out.println("\nNombre: " + cat.name + " Raza: " + cat.breed + " Color: " + cat.color);
        cat.move();
    }
}
