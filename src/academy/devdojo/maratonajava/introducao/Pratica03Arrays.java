package academy.devdojo.maratonajava.introducao;

public class Pratica03Arrays {
//O que escrever: Um array de String com capacidade para 4 nomes de carros ou personagens que você curte.
//
//A lógica no código: Atribua os valores manualmente nas posições [0], [1], [2] e [3]. Depois,
// mude o valor da posição [1] (sobrescreva o nome que estava lá) e mande imprimir apenas a primeira e a última
// posição para ver se você pegou o conceito de tamanho (tamanho - 1).

    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Joãp";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Roberto";

        nomes[1] = "Miriam";

//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[0,3]); quero saber se está certo isso. pq eu fiz e acendeu um monte de erro e por isso estou tendo que repetir a linha de sout
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Último: " + nomes[nomes.length - 1]);



        }

    }

