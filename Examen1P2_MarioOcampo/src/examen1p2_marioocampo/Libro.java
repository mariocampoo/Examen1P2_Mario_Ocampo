package examen1p2_marioocampo;
public class Libro {
    protected String titulo;
    protected String autor;
    protected int precio;


    public Libro() {
    }

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
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


    @Override
    public String toString() {
        return "Libro" + "\n"
                + " Titulo = " + titulo + "\n"
                + " Autor = " + autor + "\n"
                + " Precio = " + precio;
    }
    
    
}
