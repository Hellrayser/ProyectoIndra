class Inscripciones {
    var usuario : Usuarios = Usuarios()
    var evento : Eventos = Eventos()

    constructor(usuario: Usuarios,evento: Eventos){
        this.usuario = usuario
        this.evento = evento
    }

    override fun toString(): String {
        return "Inscripciones(usuario=$usuario, evento=$evento)"
    }

}