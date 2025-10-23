package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// QUANOD TRABALHAMOS COM INTERFACE USAMOS "IMPLEMENTS" LOGO EM SEGUIDA O NOME DA NOSSA INTERFACE "------"
public class DatabaseLoader implements DataLoader, DataRemove  {

    //COMO O METODO LOAD É UM METODO ABSTRATO SOMOS OBRIGADO A PROVER A IMPLEMENTAÇÃO DESSE METODO = ALT+ENTER IMPLEMENT METHODS
    @Override
    public void load() {
        System.out.println("Carregando dados do bando de dados");
    }

    //PRIVATE -> DEFAULT -> PROTECTED -> PUBLIC
    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

}
