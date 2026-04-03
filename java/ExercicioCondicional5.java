package estudos.logicaProgramacao;
import java.util.Scanner;
/*
Faça um algoritmo efetue o cálculo do reajuste de salário de um
funcionário. Considere que o funcionário deverá receber um reajuste de
15% caso seu salário seja menor que 500. Se o salário for maior ou igual a
500, mas menor ou igual a 1000, seu reajuste será de 10%; caso seja ainda
maior que 1000 o reajuste deverá ser de 5%”
❖ O problema estabelece três condições para calcular o reajuste do salário:
❖ 1) Salário < 500, reajuste de 15%
❖ 2) Salário > = 500, mas <= 1000, reajuste de 10%
❖ 3) Salário > 1000, reajuste de 5%
 */
public class ExercicioCondicional5 {
    public static void main(String[] args) {
        Scanner digiteSalario = new Scanner(System.in);
        double salario, salarioReajustado;
        System.out.print("Digite o seu salário: ");
        salario = digiteSalario.nextDouble();

        if (salario>0 && salario < 500){
            salarioReajustado = (0.15 * salario) + salario;
            System.out.println("O seu salário de R$"+salario+", com o reajuste vai passar a ser de R$"+salarioReajustado);
        } else if (salario>=500 && salario<=1000) {
            salarioReajustado = (0.1 * salario) + salario;
            System.out.println("O seu salário de R$"+salario+", com o reajuste vai passar a ser de R$"+salarioReajustado);
        }else if(salario > 1000){
            salarioReajustado = (0.05 * salario) + salario;
            System.out.println("O seu salário de R$"+salario+", com o reajuste vai passar a ser de R$"+salarioReajustado);
        }else{
            System.out.println("Digite um salário válido!");
        }
    }
}
