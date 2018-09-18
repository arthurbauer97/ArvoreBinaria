package ESTRUTURA2.arvoreBinaria;

import java.util.Scanner;

public class MainArvore {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Arvore arvore = new Arvore();
        int opcao;
        int numero;
        do {
            System.out.println("\n Digite a opção desejada:");
            System.out.println("1: Inserir");
            System.out.println("2: Exibir");
            System.out.println("3: Sair do programa");
            System.out.println("***********************************");
            opcao = tc.nextInt();
            switch(opcao) {
                case 1: {
                    System.out.print("Informe um numero: ");
                    numero = tc.nextInt();
                    arvore.inserir(numero);
                    break;
                }
                case 2: {
                    arvore.caminhar();
                    break;
                }
            }
        } while(opcao != 3);

    }
}