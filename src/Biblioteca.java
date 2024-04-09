

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> catalogo;
    private List<Libro> librosPrestados;

    public Biblioteca() {
        catalogo = new ArrayList<>();
        librosPrestados = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, int añoPublicacion) {
        Libro libro = new Libro(titulo, autor, añoPublicacion);
        catalogo.add(libro);
    }

    public void prestarLibro(int indice) {
        Libro libro = catalogo.get(indice);
        if (!libro.isPrestado()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println("Libro prestado: " + libro.getTitulo());
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolverLibro(int indice) {
        Libro libro = librosPrestados.get(indice);
        libro.devolver();
        librosPrestados.remove(libro);
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de la biblioteca:");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados:");
        for (Libro libro : librosPrestados) {
            System.out.println(libro);
        }
    }
}
