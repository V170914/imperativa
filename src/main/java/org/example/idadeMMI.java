package org.example;

public class idadeMMI {
    public static int contarMaioresIdade(
            Pessoa[] v,
            int qtd,
            int idadeMinima){

        int contador = 0;

        for(int i = 0; i < qtd; i++){

            if(v[i].idade >= idadeMinima){

                contador++;

            }

        }

        return contador;
    }
}
