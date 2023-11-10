package examen1p2_marioocampo;
public class LibroNoFiccion extends Libro{
    protected String tipo;

    public LibroNoFiccion() {
    }

    public LibroNoFiccion(String tipo, String titulo, String autor, int precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "LibroNoFiccion" + "\n"
                + " Tipo = " + tipo;
    }
    
    
    
}
