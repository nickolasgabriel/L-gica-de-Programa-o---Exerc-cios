package estudos.logicaProgramacao;
import java.util.Scanner;
/*
Faça um algoritmo que receba N valores, referentes ao salário de cada membro da
família, ao digitar salário igual a zero reais, o programa deve encerrar e mostrar a
soma de toda a renda familiar.
 */
public class ExercicioRepeticao4 {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        double salario, somaSalarios = 0d;
        do {
            System.out.print("Digite o salário do familiar: ");
            salario = valorDigitado.nextDouble();
            somaSalarios += salario;
        }while(salario != 0.0);
        System.out.println("A soma dos salarios de todos os membros é R$"+somaSalarios);
    }
}
