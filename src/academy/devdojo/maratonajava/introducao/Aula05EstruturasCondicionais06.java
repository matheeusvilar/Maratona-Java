package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // UTILIZANDO SWTICH DADOS OS VALOTES DE 1 A 7, IMPRIMA SE É DIA UTIL OU FINAL DE SEMANA
        //CONSIDERANDO 1 COMO DOMINGO

        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

    }
}
