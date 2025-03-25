package aula040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextInt();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        double valor_final = preco - desconto;

        System.out.printf("O valor do seu produto é R$%s, seu desconto foi R$%s, valor com desconto é R$%s",preco, desconto, valor_final);
        sc.close();
    }   
}
