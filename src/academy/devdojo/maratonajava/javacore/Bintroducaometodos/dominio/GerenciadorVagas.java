package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class GerenciadorVagas {
    public void statusVaga(int vagasTotais, int animaisCadastrados) {

        int vagasDisponiveis = vagasTotais - animaisCadastrados;
        System.out.println("O abrigo possui: " + vagasDisponiveis + " vagas disponíveis.");

    }
}
