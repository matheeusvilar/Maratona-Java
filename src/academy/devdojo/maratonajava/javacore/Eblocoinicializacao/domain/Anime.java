package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain;

public class Anime {
    private String nome;
    private int [] episodios ;
    //1 - ALOCADO ESPACO EM MEMORIA PRO OBJETO
    //2 - CADA ATRIBUTO DE CLASSE É CRIADO E INICIALIZADO COM VALORES DEFAULT OU O QUE FOR PASSADO
    //3 - O BLOCO DE INICIALIZACAO É EXECUTADO
    //4 - O CONSTRUTOR É EXECUTADO
    {
        System.out.println("Dentro do bloco de inicalizacao");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime (){

        System.out.println(episodios);
        for(int episodios: this.episodios){
            System.out.println(episodios + "");
        }
        System.out.println();

    }
    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }

}