/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.Scanner;



/**
 *
 * @author Caio Carvalho
 * 
 * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
 */
public class CounterA {
    
    public static int contarLetraA(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);            
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        
        int quantidade = contarLetraA(input);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}
