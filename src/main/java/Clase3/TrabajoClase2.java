package Clase3;

import java.util.Scanner;

public class TrabajoClase2 {

    //Calculadora operaciones básicas solicitando dos números al usuario
    public static void main(String[] args){

        float num1, num2, suma, resta, multiplicacion, division;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el primer número: ");
        num1 = scanner.nextFloat();
        System.out.println("Escriba el segundo número ");
        num2 = scanner.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1/num2;

        System.out.println("El resultado de la suma es = " + suma);
        System.out.println("El resultado de la resta es = " + resta);
        System.out.println("El resultado de la multiplicación es = " + multiplicacion);
        System.out.println("El resultado de la división es = " + division);
    }
}
