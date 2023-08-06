package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        int raio = teclado.nextInt();
        double areaCirculo = Math.PI * (raio * raio);
        teclado.close();
        System.out.println("A área do círculo com raio " + raio + " é " + areaCirculo);
    }
}
