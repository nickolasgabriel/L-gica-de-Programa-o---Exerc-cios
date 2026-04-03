package estudos.logicaProgramacao;
import java.util.Scanner;
/*
   Faça um algoritmo que leia dois valores inteiros A e B se
os valores forem iguais deverá se somar os dois. Se A for
menor que B deverá subtrair o valor B de A. Se B for
menor que A deverá multiplicar os dois valores. Ao final
imprima qual cálculo foi realizado e o resultado.
 */
public class ExercicioCondicional3 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        int A, B, resultado;
        System.out.print("Digite o valor de A: ");
        A = valores.nextInt();
        System.out.print("Digite o valor de B: ");
        B = valores.nextInt();

        if(A==B){
            resultado = A + B;
            System.out.println("A + B = "+resultado);
        }else if(A < B){
            resultado = B - A;
            System.out.println("B - A = "+resultado);
        }else{
            resultado = A * B;
            System.out.println("A * B = "+resultado);
        }
    }
}
