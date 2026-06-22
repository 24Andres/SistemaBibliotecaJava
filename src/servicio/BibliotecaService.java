package servicio;

import modelo.Libro; // se importa clase Libro
import java.util.ArrayList;
public class BibliotecaService {


    public void saludar() {
        System.out.println("Bienvenidos al sistema de biblioteca");
    }

    // nombre del metodo: mostrarLibro; nombre de la lista: listaLibro
    public void mostrarLibro(ArrayList<Libro> listaLibro) {

        for (int i = 0; i < listaLibro.size(); i++) {

            System.out.println(
                     "ID libro: "  + listaLibro.get(i).getId()
                    + ", Titulo: " + listaLibro.get(i).getTitulo()
                    + ", Autor: "  + listaLibro.get(i).getAutor()
                    + ", Stock: "  + listaLibro.get(i).getStock()
            );
        }
        //mostrar la cantidad de libros que hay en la lista
        System.out.println("Total de libros: "+listaLibro.size());
    }



}
