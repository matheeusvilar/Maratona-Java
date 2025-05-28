package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //THE FAMOUS SEE (IF)
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado para comprar bebida alcoolica.");
        }else{
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }
    }
}
