
package com.catolica;

public class Calculadora {

    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(args[0]);
        Integer num2 = Integer.valueOf(args[1]);

        Integer soma = num1 + num2;
        System.out.println(" O resultado da soma é "+ soma);

        Integer sub = num1 - num2;
        System.out.println(" O resultado da subtração é "+ sub);

        Integer mult = num1 * num2;
        System.out.println(" O resultado da multiplicação é "+ mult);

        Double div = (double) num1 / num2;
        System.out.println(" O resultado da divisão é "+ div);
    }
}