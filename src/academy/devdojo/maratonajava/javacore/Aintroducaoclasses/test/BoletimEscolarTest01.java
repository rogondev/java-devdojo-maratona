package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.BoletimEscolar;

import java.util.Scanner;

public class BoletimEscolarTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BoletimEscolar resultadoMedia = new BoletimEscolar();
        System.out.println("Digite a primeira nota:");
        double n1Usuario = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double n2Usuario = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double n3Usuario = scanner.nextDouble();

        double media = resultadoMedia.calculaMedia(n1Usuario, n2Usuario, n3Usuario);

        System.out.println("A média final do aluno é: " + media);

    }
}
