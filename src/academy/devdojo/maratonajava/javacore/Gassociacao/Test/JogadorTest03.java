package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador ("cafu");
        Time time = new Time ("Brasil");
        Jogador[] jogares = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogares);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- time ---");

        time.imprime();

    }
}
