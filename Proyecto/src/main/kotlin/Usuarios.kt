class Usuarios {
    var nombre = ""
    var correo = ""
    private var contrasenia = ""
    private var eventosApuntados = ArrayList<Eventos>()

    fun inscribirse(evento:Eventos){
        evento.inscribirUsuario(this)
        eventosApuntados.add(evento)
    }
}