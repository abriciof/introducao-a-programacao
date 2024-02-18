import java.util.Scanner;
public class Subtracao
{
    private int numA;
    private int numB;
    Subtracao(int A, int B)
    {
        this.setNumA(A);
        this.setNumB(B);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        scanner.close();
        Subtracao subtracao = new Subtracao(numA, numB);
        subtracao.imprimeSub();
    }
    public void setNumA(int numero)
    {
        this.numA = numero;
    }
    public void setNumB(int numero)
    {
        this.numB = numero;
    }
    public int getNumA()
    {
        return this.numA;
    }
    public int getNumB()
    {
        return this.numB;
    }
    public int sub()
    {
        return this.getNumA() - this.getNumB();
    }
    public void imprimeSub()
    {
        System.out.print("O resultado da subtracao eh: " + this.sub());
    }
}