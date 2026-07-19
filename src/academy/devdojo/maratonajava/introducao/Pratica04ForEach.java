package academy.devdojo.maratonajava.introducao;

public class Pratica04ForEach {
    //O que escrever: Um array de preços (tipo double[]) com 5 valores de produtos (ex: 10.50, 20.00, 5.99...).
    //Como treinar os dois mundos:
    //Primeiro, use o for tradicional (for(int i=0; i<precos.length; i++)) para imprimir cada preço.
    //Logo abaixo, faça a mesma impressão usando o for-each. Veja como ele é mais limpo:
    // for(double preco : precos)
    // { System.out.println(preco); }.
    public static void main(String[] args) {
        double[] precos = {10.50, 20.00, 17.90, 1.99, 19, 99};

//        for (int i = 0; i < precos.length; i++) {
//            System.out.println("O preço é: R$ " + precos[i]);

        for (double valor : precos) {
            System.out.println(valor);
        }

    }
}

