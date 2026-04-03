package estudos.logicaProgramacao;
/*
Escreva um programa em Java para imprimir uma grade 10x10.
Resultado esperado:

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */
public class DesafioArray {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        for (int i=0; i<10; i++){
            stringArray[i] = "- ";
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(stringArray[j]);
            }
            System.out.println();
        }
    }
}
