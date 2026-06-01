package org.example;

public class InsertDortNome {
    public static void insertionSortPorNome(Pessoa[] v, int qtd){

        for(int i = 1; i < qtd; i++){

            Pessoa atual = v[i];

            int j = i - 1;

            while(j >= 0 &&
                    v[j].nome.compareToIgnoreCase(atual.nome) > 0){

                v[j + 1] = v[j];

                j--;
            }

            v[j + 1] = atual;
        }
    }
}
