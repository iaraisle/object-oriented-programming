package ar.com.ada.online.second.objectorientedprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParseException {
        //Se crean los objetos

        Item item = new Item();
        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


        //Se le pide al usuario que ingrese los datos
        System.out.print("Ingrese el nombre del producto: ");
        item.name = keyboard.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        item.price = keyboard.nextDouble();

        System.out.print("Ingrese la fecha de vencimiento del producto(dd-MM-yyyy): ");
        String currentDate = keyboard.next();   //Se guarda la fecha en una variable de tipo STRING
        item.expirationDate = dateFormat.parse(currentDate);

        //se puede resumir en 1 línea: item.expirationDate = dateFormat.parse(keyboard.next());
        //Y aca se transforma una variable de un tipo String a Date

        item.calculateTax();

            if (item.canItBeSold()) {
                Double totalToPay = item.getTotalToPay();
                System.out.printf(
                        "-Nombre: %s\n- Precio: %.2f\n- Impuesto %.2f\n- Total a pagar: %.2f",
                        item.name,
                        item.price,
                        item.tax,
                        totalToPay //or item.getTotalToPay()
                 );

            } else {
                System.out.printf("Este item no está habilitado para la venta");

            }

        }
    }
