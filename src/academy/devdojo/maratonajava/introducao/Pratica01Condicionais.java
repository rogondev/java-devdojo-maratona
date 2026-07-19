package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Pratica01Condicionais {
    //Um programa onde você define o nível de acesso de um usuário
    // ("Admin", "Premium", "Comum") em uma variável String e o saldo dele em uma variável double.
    //Se for "Admin", exibe: "Acesso total liberado" Se for "Premium" E o saldo for maior que 100, exibe: "Menu de apostas/compras VIP liberado".
    //Se não for nenhum, exibe: "Conta padrão".

    public static void main(String[] args) {

        double valor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("********Selecione o tipo da sua conta********");
        System.out.println("1. Admin");
        System.out.println("2. Premium");
        System.out.println("3. Comum");

        int nivel = scanner.nextInt();
        if (nivel == 1) {
            System.out.println("Acesso total Liberado");
        } else if (nivel == 2) {
            System.out.println("Digite o valor da sua conta");
            valor = scanner.nextDouble();
            if (valor > 100) {
                System.out.println("Menu de apostas/compras VIP liberado");
            } else {
                System.out.println("Conta padrão.");
            }
        } else {
            System.out.println("Conta padrão");
        }
    }
}
