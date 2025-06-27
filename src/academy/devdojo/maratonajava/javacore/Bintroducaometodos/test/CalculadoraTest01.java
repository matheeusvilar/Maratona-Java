package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
       //Calculadora = IMPORTANDO A CLASSE
        //calculadora = CRIANDO VARIAVEL DE REFERENCIA
        // new Calculadora (); = CRIANDO O OBJETO
        Calculadora calculadora = new Calculadora();
        //EXECUTANDO METODO
        calculadora.somaDoisNumero();
        System.out.println("Finalizando calculadora teste");

        calculadora.subtracaoMenosNumero();


    }
}
