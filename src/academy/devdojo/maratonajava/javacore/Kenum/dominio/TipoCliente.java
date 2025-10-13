package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomerelatorio;
    TipoCliente(int valor, String nomerelatorio ) {
        this.valor = valor;
        this.nomerelatorio = nomerelatorio;
    }

    public int getValor() {
        return valor;
    }

}
