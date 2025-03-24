package aula018;

import java.util.Locale;

public class Main{
    public static void main(String[] args){

        String nome = "Diego";
        int idade = 20;
        double renda = 1518;

        int y = 32;
        double x = 10.35784;
        
        System.out.println(y);
        System.out.println("Bom dia!");

        Locale.setDefault(Locale.US); // Usar para substituir a virgula pelo ponto em double.

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x); // %.Nf%n serve para definir o (N)úmeiro de casas decimais, sempre usar printf quando for uma formatação.

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}