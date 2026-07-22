package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

//Dois métodos:
//1. Para imprimir dados.
//2. Para tirar a média dos salários e imprimir o resultado

public class FuncionarioService {
    public void exibirFicha(Funcionario funcionario) {
        System.out.println("Ficha do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());

        if (funcionario.getSalarios() == null){
            System.out.println("Salário não informado");
            return;
        }

        System.out.println("Salário 1: " + funcionario.getSalarios()[0]);
        System.out.println("Salário 2: " + funcionario.getSalarios()[1]);
        System.out.println("Salário 3: " + funcionario.getSalarios()[2]);
    }

    public void calculaMedia(Funcionario funcionario) {
        if (funcionario.getSalarios() == null || funcionario.getSalarios().length == 0) {
            return;
        }

        double soma = 0;

        for (double salario : funcionario.getSalarios()) {
            soma += salario;
        }

        double media = soma / funcionario.getSalarios().length;

        System.out.println("Média dos salários: " + media);
    }
}
