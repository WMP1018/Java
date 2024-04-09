package Clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoClase3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Se inicializa el scanner
        List<String> palabras = new ArrayList<>(); //Se crea la lista

        System.out.println("A continuación ingrese 4 palabras");
        for (int i = 1; i <= 4; i++){
            System.out.print("Por favor ingrese una palabra: ");
            String palabra = scanner.next();    //Se toman las palabras ingresadas por el usuario
            palabras.add(palabra);
        }
        for (String datosArreglo:palabras){
            if (datosArreglo.length()>4){
                System.out.println(datosArreglo);   //Se muestran las palabras con más de 4 letras
            }
        }
        scanner.close(); //Se finaliza el scanner
    }
}
