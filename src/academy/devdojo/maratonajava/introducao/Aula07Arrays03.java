package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        double[] precos = {10.50,20.00,17.90,1.99,19,99};

        for (int i = 0; i < precos.length; i++) {
            System.out.println("O preço é: R$ " + precos[i]);
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(precos[i]);
//
//            int[] numeros = {158,255,38,44};
//
//            for (int i = 0; i < numeros.length; i++) {
//                System.out.println("Número " + numeros[i]);
//
//            }

    }
}
