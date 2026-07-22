package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        FuncionarioService funcionarioService = new FuncionarioService();

        funcionario01.setNome("Roberto");
        funcionario01.setIdade(26);
        funcionario01.setSalarios(new double[]{1200, 1536.90, 3000});

        funcionarioService.exibirFicha(funcionario01);

        funcionarioService.calculaMedia(funcionario01);

    }
}
