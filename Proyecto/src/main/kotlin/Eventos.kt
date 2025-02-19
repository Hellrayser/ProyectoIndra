class Eventos {
    var nombre : String = ""
    var fechaEvento : String = ""
    var duracion : Int = 0
    var ubicacion = ""
    private var personasApuntadas = ArrayList<Usuarios>()


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
}