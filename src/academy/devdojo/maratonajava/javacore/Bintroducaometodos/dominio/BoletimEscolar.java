package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class BoletimEscolar {
    public double calculaMedia(double nota1, double nota2, double nota3){
        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        return mediaFinal;
    }
}
