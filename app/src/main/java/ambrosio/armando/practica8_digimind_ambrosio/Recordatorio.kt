package ambrosio.armando.practica8_digimind_ambrosio

import java.io.Serializable


data class Recordatorio(var dias: String, var tiempo: String, var nombre: String) : Serializable {
}