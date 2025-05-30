package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
<<<<<<< HEAD
        //OPERADORES LOGICOS
        // && (AND) || (OU) (OR) !

        int idade = 24;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLeiMaiorQueTrinta " + isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);
    }
}
=======


    //+ - / *
    int numero01 = 10;
    int numero02 = 20;
    double resultado = numero01 / (double) numero02;
    System.out.println(resultado);

    // % RESTO
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        // ELES SEMPRE VÃO RETORNAR VALOR BOOLEAN

        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueDez = 10 != 20;

        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueDez " + isDezDiferenteQueDez);

        //OPERADORES LOGICOS
        // && (AND) || (OR) ! (NOT)

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
>>>>>>> dba1735 (continued aula Estruturas condicionais)
