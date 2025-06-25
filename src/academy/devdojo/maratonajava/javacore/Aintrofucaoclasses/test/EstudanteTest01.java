package academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // CORREÇÃO AQUI

        estudante.nome = "Matheus";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
