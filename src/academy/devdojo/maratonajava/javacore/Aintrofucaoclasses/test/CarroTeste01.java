package academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintrofucaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro ();
        Carro carro2 = new Carro ();

        carro1.nome = "Creta";
        carro1.modelo = "Huyndai";
        carro1.ano = 2025;

        carro2.nome = "Argo";
        carro2.modelo = "Fiat";
        carro2.ano = 2025;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
