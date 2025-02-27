class Usuarios {
    var nombre = ""
    var correo = ""
    private var contrasenia = ""
    private var eventosApuntados = ArrayList<Eventos>()

    constructor(nombre:String,correo:String,contrasenia:String){
        this.nombre = nombre
        this.correo = correo
        this.contrasenia = contrasenia
    }
    constructor(){
    }


    fun inscribirse(evento: Eventos) {
        if (!eventosApuntados.contains(evento)) {
            eventosApuntados.add(evento)
            evento.personasApuntadas.add(this)
            println("${nombre} se ha inscrito en '${evento.nombre}'")
        } else {
            println("${nombre} ya está inscrito en '${evento.nombre}'")
        }
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