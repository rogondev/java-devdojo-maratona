package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ValidadorAcesso {
    public void validaMaioridade(String nome, int idade){
        if (idade <= 0){
            System.out.println("Idade inválida para o sistema.");
            return;
        }

        if (idade >= 18){
            System.out.println("Acesso permitido para o usuário: " + nome);
        }else{
            System.out.println("Acesso negado (Menor de idade).");
        }
        return;
    }
}
