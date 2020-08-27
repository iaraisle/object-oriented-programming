package ar.com.ada.online.second.objectorientedprogramming;

import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;


    void calculateTax() {
        this.tax = this.price * 0.21;
        //se pine this. para llamar al atributo con ese nombre de esta clase
        // (porque podria haber otra variable con el mismo nombre en main u otra clase.
    }
    Double getTotalToPay() {
        Double result = this.price + this.tax;
        return result;
    }

   Boolean canItBeSold () {
       Date today = new Date();
       Boolean canItBeSold = true;

       if (today.after(this.expirationDate)) {
           canItBeSold = false;
       }
       return canItBeSold;
   }
// Se puede resumir de esta manera
//
//       Boolean canItBeSold() {
//           Date today = new Date();
//           Boolean result = expirationDate.after(today);
//           return result;
//       }
}
