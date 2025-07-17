package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumero(){

        System.out.println(10+10);
    }

    public void subtracaoMenosNumero(){
        System.out.println(21-12);
    }

    //PARAMETROS
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //METODOS - RETORNO
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void imprimeDvisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;

        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;

    }
}
