package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class VolumeRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o comprimento do retângulo: ");
        double comprimento = teclado.nextDouble();
        System.out.println("Digite a largura do retângulo: ");
        double largura = teclado.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();
        teclado.close();
        double volumeRetangulo = comprimento * largura * altura;
        System.out.println("O volume desse retângulo é " + volumeRetangulo + " cm3");
    }
}
