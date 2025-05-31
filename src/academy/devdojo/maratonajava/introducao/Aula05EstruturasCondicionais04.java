package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //Taxable income
    //Tax per bracket
    //Premium National
    //Insurance per bracket	Total rate
    //From	up to and including
    //€ 0	€ 34,712	9.70%	27.65%	37.35%
    //€ 34,713	€ 68,507	37.35%	0%	37.35%
    //€ 68,508		49.50%	0%	49.50%
    public static void main(String[] args) {
        double salarioAnual = 7000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 17.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;

        if (salarioAnual <= 34712) {
            salarioAnual = salarioAnual * primeiraFaixa;

        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual = salarioAnual * segundaFaixa;
        } else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
