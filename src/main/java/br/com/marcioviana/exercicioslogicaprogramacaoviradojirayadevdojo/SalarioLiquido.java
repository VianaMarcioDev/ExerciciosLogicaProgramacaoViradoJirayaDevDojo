package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o total de horas trabalhadas: ");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHoraTrabalho = teclado.nextDouble();
        System.out.println("Digite o percentual de desconto: ");
        double percentualDesconto = teclado.nextDouble();
        teclado.close();
        double salarioBase = horasTrabalhadas * valorHoraTrabalho;
        double totalDescontos = (percentualDesconto / 100) * salarioBase;
        double salarioLiquido = salarioBase - totalDescontos;
        System.out.println("O slário-base é R$ " + salarioBase + "e o salário líquido é R$ " + salarioLiquido );
    }
}
