class Organizadores {
    var nombre = ""
    var correo = ""
    var telefono = ""
    var contacto = ""
    var eventosCreados = ArrayList<Eventos>()

    constructor(nombre:String,correo:String,telefono:String){
        this.nombre = nombre
        this.correo = correo
        this.telefono = telefono
    }
    constructor(nombre:String,contacto:String){
        this.nombre = nombre
        this.contacto = contacto
    }

    constructor(){
    }

    fun crearEvento(): Eventos {
        println("Nombre del evento: ")
        var nombre = readLine()?.toUpperCase() ?: "Sin nombre"

        println("Fecha del evento (DD/MM/AAAA): ")
        var fecha = readLine() ?: "No hay fecha"

        println("Duracion del evento (en horas): ")
        var duracion = readln().toIntOrNull() ?:0

        println("Tipo de ubicación del evento (Presencial/Online): ")
        var tipoUbicacion = readLine() ?: "Desconocido"
        println("Dirrecion del evento: ")
        var direccion = readLine() ?: ""
        var ubicacion = Ubicaciones(tipoUbicacion,direccion)

        println("Categoría del evento (CONFERENCIA, TALLER, ACTIVIDAD_ECOLÓGICA): ")
        val categoriaAux = readLine()?.uppercase() ?: "TALLER"
        val categoria = try {
            Categorias.valueOf(categoriaAux)
        } catch (e: IllegalArgumentException) {
            println("Categoría no válida, se asignará 'TALLER' por defecto.")
            Categorias.TALLER
        }

        println("Nombre del organizador: ")
        var nombreOrganizador = readLine() ?: "Anonimo"
        println("Contacto del organizador: ")
        var contactoOrganizador = readLine() ?: "Sin contacto"
        var organizador : Organizadores = Organizadores(nombreOrganizador,contactoOrganizador)
        return Eventos(nombre,fecha,duracion,ubicacion,categoria,organizador)
    }


    override fun toString(): String {
        return "Organizador: nombre: $nombre, correo: $correo, telefono: $telefono"
    }

}