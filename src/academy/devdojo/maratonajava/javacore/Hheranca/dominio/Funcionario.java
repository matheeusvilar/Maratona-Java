package academy.devdojo.maratonajava.javacore.Hheranca.dominio;
// (EXTENDS) estou dizendo que o funcionario vai ter todos os atributos e metodos que uma pessoa tem ate pq um funcionario e uma pessoa
public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao  de Funcionario 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicializacao  de Funcionario 2");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        System.out.println("Dentro do construtor de funcionario");
    }

    public Funcionario(String nome){
    super(nome);
    }

    public void imprime() {
        System.out.println(this.salario );
    }

    public void relatorioPagamento(){
        System.out.println("Eu " +this.nome+"Recebi o salario de "+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        salario = salario;
    }
}
