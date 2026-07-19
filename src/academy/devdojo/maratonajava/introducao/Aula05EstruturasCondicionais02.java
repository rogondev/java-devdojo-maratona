package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria juvenil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        System.out.println("***Descubra qual a sua categoria");
        System.out.println("Digite aqui a sua idade");
        Scanner scanner = new Scanner(System.in);
        double idade = scanner.nextInt();

        if(idade < 15){
            System.out.println("Categoria Infantil");
        }else if (idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }


    }
}
