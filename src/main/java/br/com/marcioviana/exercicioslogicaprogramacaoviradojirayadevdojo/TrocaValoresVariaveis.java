package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Scanner;

public class TrocaValoresVariaveis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();
        teclado.close();
        System.out.println("Primeira variável: " + valor1 + " e Segundavariável: " + valor2);
        int variavelAuxiliar = valor1;
        valor1 = valor2;
        valor2 = variavelAuxiliar;
        System.out.println("Valor das variáveis depois de invertidas = Primeira variável: " + valor1 + " e Segundavariável: " + valor2);
    }
}
