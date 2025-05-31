package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //IMPRIMA O DIA DA SEMANA, CONSIDERANDO O 1 COMO DOMINGO

        byte dia = 5;
        // char, int, byte, short, enum, String (PODEMOS USAR APENAS ISSO NO SWITCH)
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao Invalida");
        }

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Sexo invalido");
                break;


        }
    }
}
