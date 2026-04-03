package estudos.logicaProgramacao;
import java.util.Scanner;
/*
    Faca um algoritmo que leia um numero e escreva os números pares em ordem decrescente até o 2 ex:(10 a 2).
 */
public class ExercicioRepeticao {
    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
        int numero;
        double teste;
        do {
            System.out.print("Digite um número: ");
            numero = numeroDigitado.nextInt();
            teste = numero % 2;
        }while(teste != 0 || numero < 0);

        while(numero >= 2){
            System.out.println(numero);
            numero -= 2;
        }
    }
}
