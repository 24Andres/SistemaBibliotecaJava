package modelo;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int stock;

    public Libro (int id,String titulo, String autor, int stock){
        this.id=id;
        this.titulo=titulo;
        this.autor=autor;
        this.stock=stock;

    }


    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getStock(){
        return stock;
    }

}
