package academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " +professor.idade + " "+professor.sexo);
    }
}
