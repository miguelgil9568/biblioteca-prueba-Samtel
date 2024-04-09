

class Libro {
    private String titulo;
    private String autor;
    private int a�oPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int a�oPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.a�oPublicacion = a�oPublicacion;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getA�oPublicacion() {
        return a�oPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    @Override
    public String toString() {
        return "T�tulo: " + titulo + ", Autor: " + autor + ", A�o de publicaci�n: " + a�oPublicacion;
    }
}
