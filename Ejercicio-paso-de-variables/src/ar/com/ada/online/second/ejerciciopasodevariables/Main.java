package ar.com.ada.online.second.ejerciciopasodevariables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Instancia para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese un primer valor: ");
        double a = keyboard.nextInt();

        System.out.print("Ingrese un segundo valor: ");
        double b = keyboard.nextInt();

        //Instancias de clases
        Result result = new Result();
        Arithmetic​ calculations = new Arithmetic​();

        //Invocar métodos
        calculations.sum(result, a, b);
        System.out.println("El resultado de la suma es: "+ result.getResultSum());

        calculations.subtraction(result, a, b);
        System.out.println("El resultado de la resta es: "+ result.getResultSubtraction());

        calculations.multiplication(result, a, b);
        System.out.println("El resultado de la multiplicación es: " + result.getResultMultiplication());

        calculations.division(result, a, b);
        System.out.println("El resultado de la divición es: " + result.getResultDivision());

    }
}
