package estudos.logicaProgramacao;
import java.util.Scanner;
/*
Um determinado clube de kartistas deseja dividir os membros associados
em categorias baseadas na idade. Escreva um algoritmo que usa como a
entrada a idade de um membro e informa em qual categoria ele está.
Respeite as informações a seguir:
❖ 0 a 6 anos: Não pode participar do clube
❖ 7 a 10 anos: Infantil
❖ 11 a 15 anos: Juvenil
❖ 16 a 20 anos: Junior
❖ 21+ anos: Profissional
 */
public class ExercicioCondicional4 {
    public static void main(String[] args) {
        Scanner digiteIdade = new Scanner(System.in);
        int idade;
        System.out.print("Digite a idade do membro: ");
        idade = digiteIdade.nextInt();

        if(idade >= 7 && idade <= 10){
            System.out.println("Categoría: Infantil");
        } else if (idade >= 11 && idade <=15) {
            System.out.println("Categoría: Juvenil");
        }else if (idade >= 16 && idade <=20) {
            System.out.println("Categoría: Junior");
        }else if (idade >= 21) {
            System.out.println("Categoría: Profissional");
        }else{
            System.out.println("Não tem a idade suficiente para participar do clube");
        }
    }
}
