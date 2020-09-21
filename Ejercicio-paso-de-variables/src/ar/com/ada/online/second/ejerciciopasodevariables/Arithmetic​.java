package ar.com.ada.online.second.ejerciciopasodevariables;

 class Arithmetic​ {
    //Métodos

    public static void sum(Result calculateSum, double a, double b) {
        double result = a + b;
        calculateSum.setResultSum(result);
    }

    public static void subtraction(Result calculateSubtraction, double a, double b) {
        double result = a - b;
        calculateSubtraction.setResultSubtraction(result);
    }

    public static void multiplication(Result calculateMultiplication, double a, double b) {
        double result = a * b;
        calculateMultiplication.setResultMultiplication(result);
    }

    public static void division(Result calculateDivision, double a, double b) {
        double result = a / b;
        calculateDivision.setResultDivision(result);
    }

}
