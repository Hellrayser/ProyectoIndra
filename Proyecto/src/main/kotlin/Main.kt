fun main() {
    val organizadores = ArrayList<Organizadores>()
    val usuarios = ArrayList<Usuarios>()
    val eventos = ArrayList<Eventos>()
    var contadorEventos = 0
    var seguir = true
    while (contadorEventos<5){
        var organizador = Factoria.crearOrganizador()
        var evento = organizador.crearEvento()
        while (seguir){
            println("Si quieres crear un usuario y inscribirlo al evento pulsa 1 sino pulse 2")
            var eleccion = readLine()?.toIntOrNull() ?: 2
            if (eleccion == 1){
                var usuario = Factoria.crearUsuario()
                var inscripcion = Factoria.crearInscripcion(usuario,evento)
                usuario.inscribirse(evento)
                evento.listaPersonasApuntadas()
                usuario.monstrarEventosInscritos()
            }else {
                seguir = false
            }
            eventos.add(evento)
            contadorEventos++
        }
    }
    println(eventos.toString())
  }