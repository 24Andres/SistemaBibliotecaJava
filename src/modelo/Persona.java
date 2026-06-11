package modelo;

public class Persona {

    private String nombre;
    private String documento;

    public Persona(String nombre, String documento){

        this.nombre=nombre;
        this.documento=documento;
    }

    public String getNombre(){
        return nombre;
    }


    public String getDocumento(){
        return documento;
    }




}
