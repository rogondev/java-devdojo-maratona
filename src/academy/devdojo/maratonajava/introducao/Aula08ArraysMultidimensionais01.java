package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 31;

        //Determinando [meses][em branco(dias)]
        int [][] calendario = new int[12][];

        calendario[0] = new int[31];
        calendario[1] = new int[28];
        calendario[2] = new int[31];

    }
}
