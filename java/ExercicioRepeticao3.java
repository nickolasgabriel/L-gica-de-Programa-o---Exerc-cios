package estudos.logicaProgramacao;
/*
C. Faca um algoritmo que calcule e mostre a soma dos 50 primeiros números começando em 1
(1+2+3+4+...+50).
 */

public class ExercicioRepeticao3 {
    public static void main(String[] args) {
        int somador = 1;
        for (int i = 2; i<=50; i++){
            somador += i;
        }
        System.out.println("A soma dos 50 primeiros número, começando em 1 é "+somador);
    }
}
