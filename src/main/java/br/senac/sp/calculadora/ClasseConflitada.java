package br.senac.sp.calculadora;

import java.util.Random;

public class ClasseConflitada {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        int resultado = 2 + 2;
        System.out.println("O resultado de 2 + 2 é: " + resultado);

        Integer a = new Random().nextInt(100);
        Integer b = new Random().nextInt(100);
        Integer soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);

    }
}
