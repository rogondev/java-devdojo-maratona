package academy.devdojo.maratonajava.introducao;

public class Pratica06ArraysGERAL {
    public static void main(String[] args) {

        //O cenário: Imagine uma rua com 3 prédios, e cada prédio tem exatamente 2 apartamentos.
        //O que fazer: 1. Crie uma matriz de Strings chamada rua e inicialize-a diretamente na declaração
        // (em uma única linha) contendo os nomes dos moradores:
        //* Prédio 0: "Ana", "Bruno"
        //* Prédio 1: "Carlos", "Diana"
        //* Prédio 2: "Eduardo", "Flávia"
        //2. Use dois loops for tradicionais aninhados (i e j) para percorrer a matriz e printar na tela: "Prédio X, Ap Y: [Nome]".

        String [][] rua = {{"Ana", "Bruno"}, {"Carlos", "Diana"}, {"Eduardo", "Flavia"}};

        for (int i = 0; i < rua.length; i++) {
            for (int j = 0; j < rua[i].length; j++) {
                System.out.println("Prédio " + i + " AP " + j + ": " + rua[i][j]);
            }
        }
    }
}
