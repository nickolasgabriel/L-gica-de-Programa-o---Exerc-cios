package estudos.logicaProgramacao;
import java.util.Scanner;
/*
Suponha que você esteja desenvolvendo um programa para o caixa da mercearia do seu bairro.

Esse programa deve ser capaz de somar o valor unitário de um produto do comércio recebendo como entrada apenas o código identificador dele.

Para verificar o bom funcionamento da funcionalidade de soma de valor através do código você decidiu realizar testes apenas com uma parte dos produtos vendidos, para isso criou a seguinte tabela:
Código: 100 -> Produto: detergente -> Valor unitário: 1,59
Código: 101 -> Produto: Esponja -> Valor unitário: 4,59
Código: 102 -> Produto: Lã de aço -> Valor unitário: 1,79
Desenvolva o código que será utilizado para a realização dos testes com os três produtos selecionados.
 */
public class ExercicioSwitch {
    public static void main(String[] args) {
        Scanner codigoDigitado = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigo = codigoDigitado.nextInt();

        switch (codigo){
            case 100:
                System.out.println("Produto: Detergente\nValor unitário: R$1,59");
                break;
            case 101:
                System.out.println("Produto: Esponja\nValor unitário: R$4,59");
                break;
            case 102:
                System.out.println("Produto: Lã de aço\nValor unitário: R$1,79");
                break;
            default:
                System.out.println("O código desse produto não está especificado no sistema.");
        }
    }
}
