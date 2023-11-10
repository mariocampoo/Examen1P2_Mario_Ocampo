package examen1p2_marioocampo;
public class LibroReferencia extends Libro{
    protected String referencia;
    protected String ficcion;
    protected String noFiccion;

    public LibroReferencia() {
    }

    public LibroReferencia(String referencia, String ficcion, String noFiccion, String titulo, String autor, int precio, int edicion) {
        super(titulo, autor, precio, edicion);
        this.referencia = referencia;
        this.ficcion = ficcion;
        this.noFiccion = noFiccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFiccion() {
        return ficcion;
    }

    public void setFiccion(String ficcion) {
        this.ficcion = ficcion;
    }

    public String getNoFiccion() {
        return noFiccion;
    }

    public void setNoFiccion(String noFiccion) {
        this.noFiccion = noFiccion;
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
        return " LibroReferencia" + "\n"
                + " Referencia = " + referencia + "\n"
                + " Ficcion = " + ficcion + "\n"
                + " No Ficcion = " + noFiccion;
    }
    
    
}
