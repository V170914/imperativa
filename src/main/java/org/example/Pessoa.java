package org.example;

import java.util.Scanner;

public class Pessoa {
    public int idade;
    public String nome;
    public Double peso;
    public Double altura;

    public static int cadastrarPessoa(Pessoa[] v, int qtd){

        Scanner sc = new Scanner(System.in);

        if(qtd == v.length){
            System.out.println("Vetor cheio!");
            return qtd;
        }

        Pessoa p = new Pessoa();

        do{
            System.out.print("Nome: ");
            p.nome = sc.nextLine();

        }while(existeNome(v, qtd, p.nome));

        System.out.print("Idade: ");
        p.idade = sc.nextInt();

        System.out.print("Peso: ");
        p.peso = sc.nextDouble();

        System.out.print("Altura: ");
        p.altura = sc.nextDouble();

        v[qtd] = p;

        return qtd + 1;
    }

    private static boolean existeNome(Pessoa[] v, int qtd, String nome) {
        return false;
    }
}
