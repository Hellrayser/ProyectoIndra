class Ubicaciones {
    var tipo = ""
    var direccion = ""

    constructor(tipo:String,direccion:String){
        this.tipo = tipo
        this.direccion = direccion
    }

    constructor(){}

    override fun toString(): String {
        return "Ubicación ($tipo): $direccion"
    }


}