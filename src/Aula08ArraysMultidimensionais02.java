public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [2][];

        //O ARRAY 0 ESTA FAZENDO REFERENCIA AO ARRAY DE 2,3,6 POSIÇÕES.
        arrayInt[0] = new int[2];
        arrayInt[0] = new int[3];
        arrayInt[0] = new int[6];

        for (int [] arrayBase: arrayInt){
            System.out.println("-------------------------------");
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
