package examen1p2_marioocampo;
public class LibroReferencia extends Libro{


    public LibroReferencia() {
    }

    public LibroReferencia(String titulo, String autor, int precio) {
        super(titulo, autor, precio);
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    
    
    
}
