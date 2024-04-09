import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

//class Libro {
//    private String titulo;
//    private String autor;
//    private int a�oPublicacion;
//    private boolean prestado;
//
//    public Libro(String titulo, String autor, int a�oPublicacion) {
//        this.titulo = titulo;
//        this.autor = autor;
//        this.a�oPublicacion = a�oPublicacion;
//        this.prestado = false;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//
//    public int getA�oPublicacion() {
//        return a�oPublicacion;
//    }
//
//    public boolean isPrestado() {
//        return prestado;
//    }
//
//    public void prestar() {
//        prestado = true;
//    }
//
//    public void devolver() {
//        prestado = false;
//    }
//
//    @Override
//    public String toString() {
//        return "T�tulo: " + titulo + ", Autor: " + autor + ", A�o de publicaci�n: " + a�oPublicacion;
//    }
//}
//
//class Biblioteca {
//    private List<Libro> catalogo;
//    private List<Libro> librosPrestados;
//
//    public Biblioteca() {
//        catalogo = new ArrayList<>();
//        librosPrestados = new ArrayList<>();
//    }
//
//    public void agregarLibro(String titulo, String autor, int a�oPublicacion) {
//        Libro libro = new Libro(titulo, autor, a�oPublicacion);
//        catalogo.add(libro);
//    }
//
//    public void prestarLibro(int indice) {
//        Libro libro = catalogo.get(indice);
//        if (!libro.isPrestado()) {
//            libro.prestar();
//            librosPrestados.add(libro);
//            System.out.println("Libro prestado: " + libro.getTitulo());
//        } else {
//            System.out.println("El libro ya est� prestado.");
//        }
//    }
//
//    public void devolverLibro(int indice) {
//        Libro libro = librosPrestados.get(indice);
//        libro.devolver();
//        librosPrestados.remove(libro);
//        System.out.println("Libro devuelto: " + libro.getTitulo());
//    }
//
//    public void mostrarCatalogo() {
//        System.out.println("Cat�logo de la biblioteca:");
//        for (Libro libro : catalogo) {
//            System.out.println(libro);
//        }
//    }
//
//    public void mostrarLibrosPrestados() {
//        System.out.println("Libros prestados:");
//        for (Libro libro : librosPrestados) {
//            System.out.println(libro);
//        }
//    }
//}
//
//
//class Usuario {
//    private String nombre;
//    private UUID id;
//
//    public Usuario(String nombre) {
//        this.nombre = nombre;
//        this.id = UUID.randomUUID(); // Generar un identificador �nico aleatorio
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Nombre: " + nombre + ", ID: " + id;
//    }
//}


public class main {
	
	public static void main(String[] args) {
		Scanner lectura = new Scanner (System.in);
		int opcion; 
		Biblioteca biblioteca = new Biblioteca();
		do {
        biblioteca.agregarLibro("El Principito", "Antoine de Saint-Exup�ry", 1943);
        biblioteca.agregarLibro("Cien a�os de soledad", "Gabriel Garc�a M�rquez", 1967);
        biblioteca.agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
		System.out.println("Bienvenido al sistema de gestion de biblioteca \n"
				+ "1. Agregar Nuevo Libro \n"
				+ "2. Prestar libro \n"
				+ "3. Devolver libro \n"
				+ "4. Mostrar Catalogo \n"
				+ "5. Mostrar libros prestados \n"
				+ "6. Salir \n \n"
				+ "Por favor, seleccione una opcion");
		
		opcion = lectura.nextInt();
		// TODO Auto-generated method stub
		switch (opcion) { 
			case 1:
				System.out.println("Ingrese el titulo del libro ");
				String titulo= lectura.next();
				System.out.println("Ingrese el autor del libro ");
				String autor= lectura.next();
				System.out.println("Ingrese el a�o de publicacion del libro ");
				int anio= lectura.nextInt();
				  // Agregar algunos libros al cat�logo
				
		        biblioteca.agregarLibro(titulo, autor, anio);
	
				System.out.println("Libro guardado con Exito");
				break;
			case 2:
				// Prestar un libro
				System.out.println("Seleccione libro ");
				int libro= lectura.nextInt();
				biblioteca.prestarLibro(libro);
				break;
			case 3:
				// Devolver un libro
				System.out.println("Seleccione libro ");
				int libroPres= lectura.nextInt();
				biblioteca.devolverLibro(libroPres);
			break;
				case 4:// Mostrar el cat�logo
				biblioteca.mostrarCatalogo();
				break;
			case 5:
				// Mostrar libros prestados
				biblioteca.mostrarLibrosPrestados();
			break;
			case 6:
			break;
		}
		}while (opcion != 6);
	}

}
