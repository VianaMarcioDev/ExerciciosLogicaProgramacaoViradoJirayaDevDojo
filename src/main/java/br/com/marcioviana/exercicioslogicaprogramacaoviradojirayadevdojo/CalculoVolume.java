package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class CalculoVolume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência da lata: ");
        double raio = teclado.nextDouble();
        System.out.println("Digite a altura da lata: ");
        double alturaDaLata = teclado.nextDouble();
        double volumeLata = Math.PI * (raio * raio) * alturaDaLata;
        System.out.println("O volume da lata é " + volumeLata + " cm3");
        teclado.close();

    }
}
