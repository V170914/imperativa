import org.example.Pessoa;

import java.util.Scanner;

public static void imprimirPessoas(Pessoa[] v, int qtd){

    for(int i = 0; i < qtd; i++){

        double imc = calcularIMC(v[i].peso, v[i].altura);

        System.out.println("Nome: " + v[i].nome);
        System.out.println("Idade: " + v[i].idade);
        System.out.println("Peso: " + v[i].peso);
        System.out.println("Altura: " + v[i].altura);
        System.out.println("IMC: " + imc);

        System.out.println();
    }
}

private static double calcularIMC(Double peso, Double altura) {
}

void main() {
}