class Usuarios {
    var nombre = ""
    var correo = ""
    private var contrasenia = ""
    private var eventosApuntados = ArrayList<Eventos>()

    fun inscribirse(evento:Eventos){
        evento.inscribirUsuario(this)
        eventosApuntados.add(evento)
    }

    fun cancelarInscripcion(evento:Eventos){
        var i = 0
        var inscrito = false
        while (i<eventosApuntados.size && !inscrito){
            if (eventosApuntados[i]==evento){
                eventosApuntados.removeAt(i)
                inscrito = true
            }
            else {
                i++
            }
        }
        if (inscrito){
            println("Se ha cancelado la inscripción de ${this.nombre} al evento ${evento.nombre}")
        } else {
            println("${this.nombre} no estaba inscrito a ese evento")
        }
    }

    fun monstrarEventosInscritos(){
        println("Eventos en los que ${this.nombre} esta inscrito")
        var i = 0
        while (i<eventosApuntados.size){
            println(eventosApuntados[i].nombre)
            i++
        }
    }
}