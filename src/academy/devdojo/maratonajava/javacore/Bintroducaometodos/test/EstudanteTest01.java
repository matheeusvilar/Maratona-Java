package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01{
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Matheus";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Bianca";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
