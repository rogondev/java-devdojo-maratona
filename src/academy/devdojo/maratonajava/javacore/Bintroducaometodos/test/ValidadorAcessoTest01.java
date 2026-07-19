package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ValidadorAcesso;

public class ValidadorAcessoTest01 {
    public static void main(String[] args) {

        ValidadorAcesso validadorAcesso = new ValidadorAcesso();

        String nome1 = "Rodrigo";
        String nome2 = "Mauro";
        String nome3 = "Roberto";

        int idade1 = 30;
        int idade2 = 15;
        int idade3 = -5;

        validadorAcesso.validaMaioridade(nome1, idade1);

        validadorAcesso.validaMaioridade(nome2, idade2);

        validadorAcesso.validaMaioridade(nome3, idade3);

    }
}
