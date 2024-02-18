import java.util.Scanner;
public class Troca
{
    private int numA;
    private int numB;
    Troca(int A, int B)
    {
        this.setNumA(A);
        this.setNumB(B);
    }
    Troca()
    {}
    public int getNumA()
    {
        return this.numA;
    }
    public void setNumA(int numA)
    {
        this.numA = numA;
    }
    public int getNumB()
    {
        return this.numB;
    }
    public void setNumB(int numB)
    {
        this.numB = numB;
    }
    public void trocaValores()
    {
        int aux = this.getNumA();
        this.setNumA(this.getNumB());
        this.setNumB(aux);
    }
    public void imprimeValores()
    {
        System.out.println("A: " + this.getNumA());
        System.out.println("B: " + this.getNumB());
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        Troca troca = new Troca(A, B);
        troca.trocaValores();
        troca.imprimeValores();
    }
}