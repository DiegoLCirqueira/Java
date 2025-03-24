package aula026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt(); // para string - next, inteiro - nextInt, double - nextDouble, char - next().charAt(0)
        System.out.println("Voce digitou: " + x);

        sc.close();
    }
    
}
