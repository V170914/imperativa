
package org.example;

public class MaisVelhoeMagro {
    public static int maisVelhaIMCMagreza(Pessoa[] v, int qtd){

        int indice = -1;

        for(int i = 0; i < qtd; i++){

            double imc = calcularIMC(v[i].peso, v[i].altura);

            if(imc < 18.5){

                if(indice == -1 || v[i].idade > v[indice].idade){

                    indice = i;

                }

            }

        }

        return indice;
    }

    private static double calcularIMC(Double peso, Double altura) {
    }
}
