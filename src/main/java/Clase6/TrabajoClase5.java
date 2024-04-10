package Clase6;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class TrabajoClase5 {

    public static void main(String[] args) {
        int num1, num2;
        int menu;
        boolean siOpero = false;

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Calculadora de operaciones básicas con numeros enteros");
                System.out.print("Por favor ingrese el primer número entero: ");
                num1 = parseInt(scanner.next());
                System.out.print("Por favor ingrese el segundo número entero: ");
                num2 = parseInt(scanner.next());

                while (siOpero == false){
                    System.out.println("A continuación escriba el numero de la operación que desea realizar según corresponda");
                    System.out.println("1. Suma");
                    System.out.println("2 Resta");
                    System.out.println("3 Multiplicacion");
                    System.out.println("4. Division");
                    menu = parseInt(scanner.next());
                    switch (menu){
                        case 1:
                            System.out.println("El resultado de sumar: "+num1+" + "+num2+" es igual a: "+suma(num1,num2));
                            siOpero = true;
                            break;
                        case 2:
                            System.out.println("El resultado de restar: "+num1+" - "+num2+" es igual a: "+resta(num1,num2));
                            siOpero = true;
                            break;
                        case 3:
                            System.out.println("El resultado de multiplicar: "+num1+" x "+num2+" es igual a: "+multiplicacion(num1,num2));
                            siOpero = true;
                            break;
                        case 4:
                            System.out.println("El resultado de dividr: "+ num1 +" / "+ num2 +" es igual a: "+division(num1,num2));
                            siOpero = true;
                            break;
                        default:
                            System.out.println("El valor ingresado no corresponde a una opción del menú");
                            break;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Ejecución detenida, el valor ingresado no corresponde a un numero");
            }catch (ArithmeticException e){
                System.out.println("Ejecución detenida, no es posible dividir un numero entre cero");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        System.out.println("La aplicación finalizo");
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
}
