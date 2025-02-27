class Factoria {
companion object {

        fun crearUsuario():Usuarios{
                print("Nombre del usuario: ")
                val nombre = readLine() ?: ""
                print("Correo del usuario: ")
                val correo = readLine() ?: ""
                print("Contraseña: ")
                val contrasenia = readLine() ?: ""
            return Usuarios(nombre,correo,contrasenia)
        }

        fun crearOrganizador(): Organizadores {
                print("Nombre del organizador: ")
                var nombre = readLine()?.toUpperCase() ?: ""
                print("Correo del organizador: ")
                var correo = readLine() ?: ""
                print("Teléfono del organizador: ")
                var telefono = readLine() ?: ""
        return Organizadores(nombre, correo, telefono)
        }

        fun crearInscripcion(usuario: Usuarios, evento: Eventos): Inscripciones {
        return Inscripciones(usuario, evento)
        }

        fun crearUbicacion(tipo: String, detalle: String): Ubicaciones {
        return Ubicaciones(tipo, detalle)
        }

    }
}