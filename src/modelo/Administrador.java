package modelo;

public class Administrador extends Persona {

    private String cargo;

    public Administrador(String nombre, String documento, String cargo){
        super(nombre, documento);
        this.cargo=cargo;
    }

    public String getCargo(){

        return cargo;
    }




}
