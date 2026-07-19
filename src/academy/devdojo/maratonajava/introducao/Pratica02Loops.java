package academy.devdojo.maratonajava.introducao;
//O que escrever: Um loop que simula uma porcentagem subindo.
//A lógica no código com for: Faça o contador começar em 0, ir até 100,
// mas subindo de 10 em 10 (i += 10). Dentro do loop,
// mande imprimir: "Carregando sistema... " + i + "%".

public class Pratica02Loops {
    public static void main(String[] args) {



        for (int progresso = 0; progresso <= 100; progresso+=10) {
            System.out.println("Carregamento: " + progresso);
        }
        System.out.println("Carregamento concluído");
    }
}
