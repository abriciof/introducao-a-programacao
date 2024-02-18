import java.util.Scanner;
public class Adicao
{
    private int numA;
    private int numB;
    Adicao(int A, int B)
    {
        this.setNumA(A);
        this.setNumB(B);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int numA = leitor.nextInt();
        int numB = leitor.nextInt();
        leitor.close();
        Adicao adicao = new Adicao(numA, numB);
        adicao.imprimeResultado();
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
    public int soma()
    {
        return this.getNumA() + this.getNumB();
    }
    public void imprimeResultado()
    {
        System.out.print("O resultado da adicao eh: " + this.soma());
    }
}