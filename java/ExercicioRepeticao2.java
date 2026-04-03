package estudos.logicaProgramacao;
import java.util.Scanner;
/*
B. Faca um algoritmo que leia 10 números. Ao final, escreva a quantidade de números
positivos e negativos digitados.
 */
public class ExercicioRepeticao2 {
    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
        int numero, contadorPositivo = 0, contadorNegativo = 0;
        for (int i=1; i<=10; i++){
            System.out.print("Digite um número: ");
            numero = numeroDigitado.nextInt();
            if (numero >= 0){
                contadorPositivo += 1;
            }else{
                contadorNegativo += 1;
            }
        }
        System.out.println("A quantidade de valores positivos digitados foram "+contadorPositivo);
        System.out.println("A quantidade de valores negativos digitados foram "+contadorNegativo);
    }
}
