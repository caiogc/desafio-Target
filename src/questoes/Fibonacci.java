/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.Scanner;


/**
 *
 * @author pcain
 */
public class Fibonacci {
    
   public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        
        int a = 0, b = 1;
        int nextFib = a + b;

        while (nextFib <= num) {
            if (nextFib == num) {
                return true;
            }
            a = b;
            b = nextFib;
            nextFib = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
