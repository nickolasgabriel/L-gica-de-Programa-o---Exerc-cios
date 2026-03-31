package estudos.logicaProgramacao;
import java.util.Scanner;

public class ExerciciosDecisao {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number1, number2, number3;

        System.out.println("Digite Três números e te diremos qual é o maior entre eles.");
        System.out.println("Digite um número: ");
        number1 = number.nextInt();
        System.out.println("Digite um número: ");
        number2 = number.nextInt();
        System.out.println("Digite um número: ");
        number3 = number.nextInt();

        if (number1>number2 && number1>number3){
            System.out.println("O maior número é "+number1);
        }else if (number2>number1 && number2>number3){
            System.out.println("O maior número é "+number2);
        }else{
            System.out.println("O maior número é "+number3);
        }
    }
}
