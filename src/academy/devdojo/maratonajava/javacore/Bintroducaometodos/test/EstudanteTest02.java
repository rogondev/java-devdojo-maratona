package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Jimmy";
        estudante01.idade = 43;
        estudante01.sexo = 'M';

        estudante02.nome = "Omar";
        estudante02.idade = 39  ;
        estudante02.sexo = 'M';
// Bloco utilizado para trinar ref this
//        estudante01.imprime();
//        estudante02.imprime();

    }
}
