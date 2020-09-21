package ar.com.ada.online.second.inheritanceextends;

import zoo.Dog;
import zoo.Horse;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Corgi", 4, 5);
        Dog dog2 = new Dog("Pomeranian", 4 , 7 );

        Horse horse1 = new Horse("Percheron", "Thor", 95);
        Horse horse2 = new Horse("Criollo", "Loki", 56);

        System.out.println("\nPerro 1 toString: " + dog1.toString());
        System.out.println("hashCode: " + dog1.hashCode());

        System.out.println("\nPerro 2 toString: " + dog2.toString());
        System.out.println("hashCode: " + dog2.hashCode());

        System.out.println("\nCaballo 1 toString: " + horse1.toString());
        System.out.println("hashCode: " + horse1.hashCode());

        System.out.println("\nCaballo 2 toString: " + horse2.toString());
        System.out.println("Second horse hashCode: " + horse2.hashCode());

        System.out.printf("\nSe compara si ambos perros son iguales: %s"
                , dog1.equals(dog2));
        System.out.printf("\nSe compara si ambos caballos son iguales: %s"
                , horse1.equals(horse2));
    }

}
