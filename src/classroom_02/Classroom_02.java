package classroom_02;

import java.util.Scanner;

public class Classroom_02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // calculo IMC
        /* System.out.print("Digite a altura: ");
        double altura = leia.nextDouble();
        
         System.out.print("Digite seu peso: ");
        double peso = leia.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é: " + imc);*/
        // Criação e uso de arrays
        //vetor ou array unidirecional de 4 casas
        int[] numeros = new int[4];

        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;

        //declarar os valores entre chaves "{}"
        String[] frutas = {"Banana", "Pera", "Maçã", "Uva"};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        System.out.println("");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas: " + frutas[i]);
        }

        // Adicionando mais um valor no array
        int[] aux = new int[numeros.length + 1];

        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
        }

        numeros = aux;
        aux[4] = 10;

        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        System.out.println("");

        //array duplo multidimencional
        int[][] valores = new int[4][4];
        int[][] matriz = {//0  1  2  3
            /*0*/{1, 3, 5, 7},
            /*1*/ {2, 4, 6, 8},
            /*2*/ {15, 22, 44, 30},
            /*3*/ {9, 3, 2, 4}
        };
        System.out.println("");
        System.out.println("Mostrar impressão com 2 FOR");
        //imprimir array multidimencional
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");

            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Matriz: " + matriz[i][j]);
            }
        }
        System.out.println("");
        System.out.println("Mostrar impressão manual");
        //imprimir manual
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            System.out.println("Matriz: " + matriz[i][0]);
            System.out.println("Matriz: " + matriz[i][1]);
            System.out.println("Matriz: " + matriz[i][2]);
            System.out.println("Matriz: " + matriz[i][3]);
        }

    }

}
