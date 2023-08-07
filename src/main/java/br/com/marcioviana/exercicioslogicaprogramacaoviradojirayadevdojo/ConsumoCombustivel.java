package br.com.marcioviana.exercicioslogicaprogramacaoviradojirayadevdojo;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a quantidade de horas da viagem: ");
        double tempoGasto = teclado.nextDouble();
        System.out.println("Entre com a velocidade do carro: ");
        double velocidade = teclado.nextDouble();
        double distanciaEmKm = tempoGasto * velocidade;
        teclado.close();
        double rendimentoCombustivel = distanciaEmKm / 12;
        System.out.println("O consumo dessa viagem é " + rendimentoCombustivel + "litros");
    }
}
