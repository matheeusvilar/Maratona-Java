package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco .setRua("Rua 3");
        endereco.setCep("0123456-289");
        Pessoa pessoa = new Pessoa();
        pessoa .setNome("Matheus");
        pessoa .setCpf("123456789");
        pessoa .setEndereco(endereco);
        pessoa.imprime();
    }
}
