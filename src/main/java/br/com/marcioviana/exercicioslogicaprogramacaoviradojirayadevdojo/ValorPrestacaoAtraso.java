package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class ValorPrestacaoAtraso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da prestação: ");
        double valorPrestacao = teclado.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        double taxaJuros = teclado.nextDouble();
        System.out.println("Digite quantos meses está atrasado: ");
        double tempoAtraso = teclado.nextDouble();
        teclado.close();
        double valorPrestacaoComJuros = valorPrestacao + (valorPrestacao * ( taxaJuros / 100) * tempoAtraso);
        System.out.println("A prestação R$ " + valorPrestacao + " fica em R$ " + valorPrestacaoComJuros + " após o cálculo do atraso.");
    }
}
