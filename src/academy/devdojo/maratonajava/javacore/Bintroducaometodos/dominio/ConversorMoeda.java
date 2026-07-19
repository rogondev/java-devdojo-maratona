package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ConversorMoeda {
    public double converterDolarParaReal(double valorDolar, double cotacao){
        double valorReal = valorDolar * cotacao;

        return valorReal;
    }
}
