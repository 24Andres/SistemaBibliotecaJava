package modelo;

public class Usuario extends  Persona  {


    private String correo;

    public Usuario (String nombre, String documento, String correo){

        super(nombre, documento);
        this.correo=correo;
    }

    public String getCorreo(){
        return correo;

    }




}
