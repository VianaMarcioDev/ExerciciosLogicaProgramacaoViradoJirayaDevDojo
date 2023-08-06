package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class ConersaoParaFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com uma temperatura em graus Celsius: ");
        double celsius = teclado.nextDouble();
        double farenheit = ((9 * celsius) /  5) + 32;
        System.out.println(celsius + " graus Celsius correspondem a " + farenheit + "graus Farenheit");
        teclado.close();
    }

}
