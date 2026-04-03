package estudos.logicaProgramacao;
import java.util.Scanner;
/*
Escreva um programa em Java para verificar se um array contém um valor específico .
 */
public class ExercicioArray {
    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
        int[] numeroArray = new int[]{1,2,3,5,6,7};
        int numero, verificar = 0;
        System.out.println("Digite o numero que você deseja procurar: ");
        numero = numeroDigitado.nextInt();

        for (int i = 0; i<numeroArray.length; i++){
            if (numero == numeroArray[i]){
                System.out.println("Esse numero está no array!");
                verificar = 1;
                break;
            }
        }
        if (verificar == 0){
            System.out.println("Esse número não está no array!");
        }
    }
}
