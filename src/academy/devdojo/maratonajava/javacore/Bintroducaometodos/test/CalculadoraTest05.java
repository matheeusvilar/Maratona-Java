package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
                    //variavel de referencia // esse new Calculadora estamos criando o objeto
        Calculadora calculadora = new Calculadora ();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarAgrs(1,2,3,4,5,6,7);
    }
}
