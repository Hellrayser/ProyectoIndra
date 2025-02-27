class Eventos {
    var nombre : String = ""
    var fecha : String = ""
    var duracion : Int = 0
    var ubicacion : Ubicaciones = Ubicaciones()
    var categoria : Categorias = Categorias.TALLER
    var organizador : Organizadores = Organizadores()
    var personasApuntadas = ArrayList<Usuarios>()

    constructor(nombre: String, fecha: String,duracion:Int, ubicacion: Ubicaciones, categoria: Categorias, organizador: Organizadores) {
        this.nombre = nombre
        this.fecha = fecha
        this.duracion = duracion
        this.ubicacion = ubicacion
        this.categoria = categoria
        this.organizador = organizador
    }

    constructor(){}

    fun inscribirUsuario(usuario: Usuarios){
        if (!personasApuntadas.contains(usuario)){
            personasApuntadas.add(usuario)
            println("${usuario.nombre} se ha apuntado al $nombre")
        }else {
            println("${usuario.nombre} ya esta apuntado al evento")
        }
    }

    fun cancelarEvento(){
        println("El evento $nombre ha sido cancelado")
        personasApuntadas = ArrayList()
    }

    fun listaPersonasApuntadas(){
        println("Usuarios inscritos en $nombre")
        var i = 0
        while (i<personasApuntadas.size){
            println(personasApuntadas[i].nombre)
            i++
        }
    }

    override fun toString(): String {
        return "Evento: $nombre, Fecha: $fecha, Duración: $duracion, Ubicación: $ubicacion, Categoría: $categoria, Organizado por: ${organizador.nombre}"
    }

}