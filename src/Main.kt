fun main() {
    val libros: Map<String, Libro> = mapOf(
        "libro1" to Libro("Cien años de soledad", "Gabriel García Márquez", 471, 9.5),
        "libro2" to Libro("1984", "George Orwell", 328, 9.0),
        "libro3" to Libro("El principito", "Antoine de Saint-Exupéry", 96, 9.2)
    )

    val libreria = ConjuntoLibros()
    for (libro in libros.values) {
        libreria.aniadirLibro(libro)
    }

    libreria.mostrarDetallesLibros()
    libreria.mostrarTopBot()

    println("-- Introduciendo nuevos libros en la librería...\n")
    libreria.aniadirLibro(Libro("El Señor de los Anillos", "J. R. R. Tolkien", 559, 9.8))
    libreria.aniadirLibro(Libro("Harry Potter y el Prisionero de Azkaban", "J. K. Rowling", 359, 8.3))

    libreria.mostrarDetallesLibros()

    println("-- Eliminando libros de J. K. Rowling...\n")
    libreria.borrarLibroAutor("J. K. Rowling")

    libreria.mostrarDetallesLibros()

    println("-- Eliminando TODOS los libros...\n")
    libreria.borrarLibroAutor("Gabriel García Márquez")
    libreria.borrarLibroAutor("George Orwell")
    libreria.borrarLibroAutor("Antoine de Saint-Exupéry")
    libreria.borrarLibroAutor("J. R. R. Tolkien")

    libreria.mostrarDetallesLibros()

    println("-- Añadiendo 'La historia de tu vida'...\n")
    libreria.aniadirLibro(Libro("La historia de tu vida", "Ted Chiang", 336, 9.5))

    libreria.mostrarDetallesLibros()
}
