package one.digitalinnovation.digionebank.one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
     nome : String,
     cpf : String,
    val salario : BigDecimal
) : Pessoa(nome,cpf)  {
    abstract fun calculoAuxilio();
}