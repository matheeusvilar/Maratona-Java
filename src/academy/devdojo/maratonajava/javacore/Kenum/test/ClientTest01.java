package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1  = new Cliente("Nanami", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2  = new Cliente("Jogo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
