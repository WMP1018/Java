package Clase2;

public class TrablajoClase1 {
    //El objeto describe un libro
    String nombre;
    String autor;
    String editorial;
    String ISBN;
    int paginas;
    int capitulos;
    int numEdicion;

    public boolean leido(String nombre){
        boolean yaLoLei = false;

        if (nombre == "El coronel no tiene quien le escriba"){
            yaLoLei = true;
        }

        return yaLoLei;
    }

    public void listaLectura(String nombre){
        System.out.println("Lo tendré pendiente por leer");
    }

    public static void enProceso(){
        System.out.println("Estoy leyendo ahora");
    }
}
