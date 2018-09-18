package ESTRUTURA2.arvoreBinaria;

import java.util.Scanner;

public class Arvore {
    private NoArvore raiz; // raiz

    Scanner tc = new Scanner(System.in);

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new NoArvore(valor);
        } else {
            NoArvore novo = new NoArvore(valor);
            inserir(raiz, novo);
        }
    }

    private void inserir(NoArvore arvore, NoArvore novo) {
        if (novo.valor > arvore.valor) {
            if (arvore.direita == null) {
                arvore.direita = novo;
            } else {
                inserir(arvore.direita, novo);
            }
        } else {
            if (arvore.esquerda == null) {
                arvore.esquerda = novo;
            }
                else {
                    inserir(arvore.esquerda, novo);
                }
         }
    }

    public void caminhar() {
        System.out.print("\n Em ordem (ERD): ");
        inOrder(raiz);
        System.out.print("\n Pos-ordem (EDR): ");
        posOrder(raiz);
        System.out.print("\n Pre-ordem (RED): ");
        preOrder(raiz);

    }

    public void inOrder(NoArvore atual) {
        if (atual != null) {
            inOrder(atual.esquerda);
            System.out.print(atual.valor + " ");
            inOrder(atual.direita);
        }
    }

    public void preOrder(NoArvore atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            preOrder(atual.esquerda);
            preOrder(atual.direita);
        }
    }

    public void posOrder(NoArvore atual) {
        if (atual != null) {
            posOrder(atual.esquerda);
            posOrder(atual.direita);
            System.out.print(atual.valor + " ");
        }
    }
}