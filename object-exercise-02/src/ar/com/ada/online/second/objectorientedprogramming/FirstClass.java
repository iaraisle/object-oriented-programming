package ar.com.ada.online.second.objectorientedprogramming;

import java.util.Date;

public class FirstClass {
    String name;
    Double price;
    Double tax;
    Date expirationDate;


    void calculateTax() {
        tax = price * 0.21;
    }
    Double getTotalToPay() {
        Double result = price + tax;
        return result;
    }

    Boolean canItBeSold () {

        return
    }

}

}
