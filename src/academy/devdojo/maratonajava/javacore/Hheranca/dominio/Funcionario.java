package academy.devdojo.maratonajava.javacore.Hheranca.dominio;
// (EXTENDS) estou dizendo que o funcionario vai ter todos os atributos e metodos que uma pessoa tem ate pq um funcionario e uma pessoa
public class Funcionario extends Pessoa {

    private double salario;

    public void imprime() {
        System.out.println(this.salario );
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        salario = salario;
    }
}
