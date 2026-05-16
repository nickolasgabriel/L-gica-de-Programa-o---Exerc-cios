package estudos.logicaProgramacao;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args){
        Scanner lerNumero = new Scanner(System.in);
        int[] arrNumeros = new int[15];
        int lerMenu, lerIndice, lerValor;

        do{
            System.out.println("O que você deseja fazer?");
            do {
                System.out.println("1- Cadastrar valor;\n2- Somar a um valor;\n3- Multiplicar a um valor;\n4- Incrementar a todos os valores;\n5 Listar todos os valores;\n6- Sair;");
                lerMenu = lerNumero.nextInt();
            }while(lerMenu < 1 || lerMenu > 6);
            switch (lerMenu){
                case 6:
                    break;
                case 1:
                    do{
                        System.out.print("Digite o valor do índice (entre 1 e 15), no qual você deseja adcionar um número: ");
                        lerIndice = lerNumero.nextInt();
                    }while(lerMenu < 1 || lerMenu > 15);
                    System.out.println("Digite o valor que você deseja adicionar: ");
                    lerValor = lerNumero.nextInt();
                    arrNumeros[--lerIndice] = lerValor;
                    break;
                case 2:
                    do {
                        System.out.print("Digite o valor do índice (entre 1 e 15): ");
                        lerIndice = lerNumero.nextInt();
                    }while(lerMenu < 1 || lerMenu > 15);
                    System.out.println("Digite o valor que você somar com o que existe no índice: ");
                    lerValor = lerNumero.nextInt();
                    arrNumeros[--lerIndice] += lerValor;
                    break;
                case 3:
                    do {
                        System.out.print("Digite o valor do índice (entre 1 e 15): ");
                        lerIndice = lerNumero.nextInt();
                    }while(lerMenu < 1 || lerMenu > 15);
                    System.out.println("Digite o valor que você quer multiplicar com o que existe no índice: ");
                    lerValor = lerNumero.nextInt();
                    arrNumeros[--lerIndice] *= lerValor;
                    break;
                case 4:
                    for (int i=0; i<arrNumeros.length; i++){
                        arrNumeros[i]++;
                    }
                    System.out.println("Foi adicionado +1 a todos os elementos!");
                    break;
                case 5:
                    for(int i : arrNumeros){
                        System.out.print(i + "  |  ");
                    }
                    //apenas para saltar uma linha
                    System.out.println();
                    break;
            }
        }while(lerMenu != 6);
    }
}
