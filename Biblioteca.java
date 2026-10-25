public class Biblioteca {
    // Creamos un arreglo con capacidad para 10 libros
    Libro[] coleccion = new Libro[10];
    int contador = 0; 

    // Método para agregar libros a la biblioteca
    public void agregarLibro(Libro nuevoLibro) {
        if (contador < coleccion.length) {
            coleccion[contador] = nuevoLibro;
            contador++; 
        } else {
            System.out.println("Error: La biblioteca está llena.");
        }
    }

    // Método para mostrar todos los libros disponibles
    public void mostrarLibros() {
        System.out.println("=== LIBROS DISPONIBLES EN LA BIBLIOTECA ===");
        for (int i = 0; i < contador; i++) {
            System.out.println("Título: " + coleccion[i].titulo);
            System.out.println("Autor: " + coleccion[i].autor);
            System.out.println("Año de publicación: " + coleccion[i].anioPublicacion);
            System.out.println("-----------------------------------------");
        }
    }

    
    public static void main(String[] args) {
        // Creamos la instancia de la biblioteca
        Biblioteca miBiblioteca = new Biblioteca();

        // Creamos las instancias de los 4 libros
        Libro libro1 = new Libro("Hacking Ético y Ciberseguridad", "Kevin Mitnick", 2021);
        Libro libro2 = new Libro("Ariana Grande: La biografía", "Danny White", 2017);
        Libro libro3 = new Libro("Redes de Computadoras", "Andrew S. Tanenbaum", 2012);
        Libro libro4 = new Libro("El esclavo", "Anand Dílvar", 2013);

        // Agregamos los libros
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);
        miBiblioteca.agregarLibro(libro4);

        // Mostramos el resultado en pantalla
        miBiblioteca.mostrarLibros();
    }
}