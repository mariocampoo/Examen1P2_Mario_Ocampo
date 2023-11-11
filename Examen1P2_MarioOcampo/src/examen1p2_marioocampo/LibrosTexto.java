package examen1p2_marioocampo;


public class LibrosTexto extends Libro{
    
    protected int curso;
    protected String facultad;

    public LibrosTexto() {
    }

    public LibrosTexto(int curso, String facultad, String titulo, String autor, int precio) {
        super(titulo, autor, precio);
        this.curso = curso;
        this.facultad = facultad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibrosTexto" + "\n"
                + " Titulo = " + titulo + "\n"
                + " Autor = " + autor + "\n"
                + " Precio = " + precio + "\n"
                + " Curso = " + curso + "\n"
                + " Facultad = " + facultad;
    }

    
    
    
}
