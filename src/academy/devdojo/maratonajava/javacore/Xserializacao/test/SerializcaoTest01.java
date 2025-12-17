package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.ObjectOutputStream;

public class SerializcaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Carlos Matheus","123456");
    }

    private static void serializar(){
        //try(ObjectOutputStream oos);
    }
}
