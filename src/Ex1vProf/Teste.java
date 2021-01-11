package Ex1vProf;

import java.util.List;

public class Teste<T extends Number> {

    public double soma(T[] vetor){
        double soma = 0;
        for(T elemento: vetor){
            soma = soma + elemento.doubleValue();
        }
        return soma;
    }

    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];
        Double[] vetor2 = new Double[10];
        Documento[] vetor3 = new Documento[10];



        Teste teste = new Teste();
        teste.soma(vetor);
        teste.soma(vetor2);
//        teste.soma(vetor3);
//        int resultado = somaVetor(vetor);
    }
}
