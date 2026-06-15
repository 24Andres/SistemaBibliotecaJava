import modelo.Administrador;
import modelo.Prestamo;
import modelo.Usuario;
import java.util.ArrayList;
import modelo.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Usuario objUsuario = new Usuario("Andres", "132132", "45@gmial.com");
        System.out.println("Los datos del usuario son: \nNombre: "+objUsuario.getNombre()+" \nC.C. "+objUsuario.getDocumento()+" \nCorreo: "+objUsuario.getCorreo());

        System.out.println("");

        Administrador objAdmin = new Administrador("Calors","456465","Gerente regional");
        System.out.println("Datos del adm: \nNombre: "+objAdmin.getNombre()+" \nDocumento: "+objAdmin.getDocumento()+" \nCargo: "+objAdmin.getCargo());


        System.out.println("______________________________\n");

        //Agregar libros
        ArrayList<Libro> listaLibro = new ArrayList<>();
        Libro libro1 = new Libro(1,"Java basic", "kelvin",50);
        Libro libro2 = new Libro(2,"Python", "Valen", 50);
        Libro libro3 = new Libro(3, "SQL", "Rafa", 100);
        listaLibro.add(libro1);
        listaLibro.add(libro2);
        listaLibro.add(libro3);


        //reducir stock del libro 1
        libro1.setStock(libro1.getStock()-10);
        libro2.setStock(libro2.getStock()-15);


        //Presentacion libros
        for(int i=0; i < listaLibro.size(); i++){
            System.out.println("Libro No."+listaLibro.get(i).getId()+
                    ", Titulo: "+listaLibro.get(i).getTitulo()+" " +
                    ", Autor: "+listaLibro.get(i).getAutor()+
                    ", Stock: "+listaLibro.get(i).getStock() );
        }
        System.out.println("La cantidad de libros son: "+listaLibro.size());




        // Lista de Prestamos de libros
        System.out.println("\n----- PRESTAMO -----");
        ArrayList<Prestamo> listaPrestamo = new ArrayList<>();

        Prestamo objPrestamo1 = new Prestamo(objUsuario,libro1);
        Prestamo objPrestamo2 = new Prestamo(objUsuario,libro2);

        listaPrestamo.add(objPrestamo1);
        listaPrestamo.add(objPrestamo2);

        for(int i = 0; i<listaPrestamo.size(); i++){
            System.out.println("usuario: "+listaPrestamo.get(i).getUsuario().getNombre()+
                    ", Libro: "+listaPrestamo.get(i).getLibro().getTitulo());
        }

       /* System.out.println("Prestamo 1 al señor: "
                +objPrestamo1.getUsuario().getNombre()+", Libro: "
                +objPrestamo1.getLibro().getTitulo()+", con ID: "
                +objPrestamo1.getLibro().getId());*/




        }




    }






























