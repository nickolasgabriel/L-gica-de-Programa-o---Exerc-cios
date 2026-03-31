package estudos.logicaProgramacao;

public class Exercício1 {
    public static void main(String[] args) {
        int A = 10, B = 20, C;
        System.out.println("Valor A: "+A+"\nValor B: "+B+"\n");
        C = A;
        A = B;
        B = C;
        System.out.println("Valor A: "+A+"\nValor B: "+B);
    }
}
