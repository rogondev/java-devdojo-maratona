package academy.devdojo.maratonajava.introducao;
//2. O Abrigo Irregular (Array Assimétrico)
//Objetivo: Praticar a inicialização onde cada linha tem um tamanho diferente (igual ao da aula).
//O cenário: No seu abrigo de pets, o espaço de gatis e canis mudou. Agora você tem:
//Linha 0 (Gatos): espaço para 2 nomes.
//Linha 1 (Cachorros): espaço para 4 nomes.
//Linha 2 (Coelhos): espaço para 1 nome.
//O que fazer:
//Declare a matriz de Strings abrigo inicializando-a diretamente com as chaves de tamanhos diferentes. Coloque nomes fictícios de pets para preencher todos os espaços.
//Use a estrutura do for-each (o for simplificado que aparece na sua imagem, ex: for(String[] linha : abrigo)) para varrer e printar apenas os nomes dos animais seguidos de um espaço.

public class Pratica07ArraysGERAL {
    public static void main(String[] args) {
        String[][] abrigo = {
                {"Thor", "Bob"},               // Linha 0 (Gatos)
                {"Mel", "Max", "Luke", "Rex"}, // Linha 1 (Cães)
                {"Pompom"}                     // Linha 2 (Coelhos)
        };

        // Usamos o for tradicional na linha para descobrir o índice 'i'
        for (int i = 0; i < abrigo.length; i++) {

            // Criamos uma variável para guardar o tipo baseado no número da linha
            String tipoAnimal = "";
            if (i == 0) tipoAnimal = "Gato";
            else if (i == 1) tipoAnimal = "Cachorro";
            else if (i == 2) tipoAnimal = "Coelho";

            // O loop de dentro pode continuar sendo um for-each simplificado!
            // Ele vai varrer a linha atual: abrigo[i]
            for (String nomePet : abrigo[i]) {
                System.out.println("Nome do pet: " + nomePet + ". Tipo de animal: " + tipoAnimal);
            }
        }
    }
}
