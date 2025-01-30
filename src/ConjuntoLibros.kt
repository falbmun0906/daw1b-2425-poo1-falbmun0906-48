class ConjuntoLibros(val conjuntoLibros: Array<Libro?> = arrayOfNulls(10)) {

    fun aniadirLibro(libroRequest: Libro): Boolean {
        if (!(this.conjuntoLibros.any { it == libroRequest })) {
            for ((i, libro) in conjuntoLibros.withIndex()) {
                if (libro == null) {
                    conjuntoLibros[i] = libroRequest
                    return true
                }
            }
        }
        return false
    }

    fun borrarLibroTitulo(tituloLibro: String): Boolean {
        if (this.conjuntoLibros.any { it?.titulo == tituloLibro }) {
            for ((i, libro) in conjuntoLibros.withIndex()) {
                if (libro?.titulo == tituloLibro) {
                    conjuntoLibros[i] = null
                    return true
                }
            }
        }
        return false
    }

    fun borrarLibroAutor(autorLibro: String): Boolean {
        if (this.conjuntoLibros.any { it?.autor == autorLibro }) {
            for ((i, libro) in conjuntoLibros.withIndex()) {
                if (libro?.autor == autorLibro) {
                    conjuntoLibros[i] = null
                    return true
                }
            }
        }
        return false
    }

    fun mostrarTopBot() {
        val calificaciones: MutableList<Double> = mutableListOf()
        for (libro in conjuntoLibros) {
            if (libro != null) {
                calificaciones.add(libro.calificacion)
            }
        }
        val maxPuntuacion: Double = calificaciones.maxBy { it }
        val minPuntuacion: Double = calificaciones.minBy { it }

        println("LIBROS MEJOR CALIFICADOS ($maxPuntuacion):")
        for (libro in conjuntoLibros) {
            if (libro?.calificacion == maxPuntuacion) {
                println("\t${libro.titulo} - ${libro.autor}\n")
            }
        }

        println("LIBROS PEOR CALIFICADOS ($minPuntuacion):")
        for (libro in conjuntoLibros) {
            if (libro?.calificacion == minPuntuacion) {
                println("\t${libro.titulo} - ${libro.autor}\n")
            }
        }

    }

    fun mostrarDetallesLibros() {
        println("LISTADO COMPLETO:")
        for (libro in conjuntoLibros) {
            if (libro != null)
            println("\t${libro.titulo}\n\t${libro.autor}\n\tNum.Pág: ${libro.numeroPaginas}\n\tCalificación: ${libro.calificacion}\n")
        }
    }
}