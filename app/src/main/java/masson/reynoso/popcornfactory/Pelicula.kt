package masson.reynoso.popcornfactory

data class Pelicula (var titulo: String,
                     var imagen: Int,
                     var header: Int,
                     var sinopsis: String,
                     var seats: ArrayList<Cliente>)