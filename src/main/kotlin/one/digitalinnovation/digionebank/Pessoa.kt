package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Arnaldo"
    var cpf : String = "123.123.123-11"

    private set
}
fun main(){
    val arnaldo = Pessoa()


    println(arnaldo)
    println(arnaldo.nome)
    println(arnaldo.cpf)

}