package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
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