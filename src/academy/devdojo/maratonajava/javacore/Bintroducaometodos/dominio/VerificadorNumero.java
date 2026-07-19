package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class VerificadorNumero {
    public void verificaParidade(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número: " + numero + " é par");
        } else
            System.out.println("O número: " + numero + " é impar");
    }


}
